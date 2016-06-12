package am.gitc.service.service.impl;

import am.gitc.common.FileUtil;
import am.gitc.common.model.entity.Book;
import am.gitc.service.repository.BookRepository;
import am.gitc.service.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import static am.gitc.common.Constants.STORAGE_PATH;

/**
 * Created by zorikz on 06/01/2016.
 */
@Service
@Transactional
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;

    @Override
    public Page<Book> findAll(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

    @Override
    public Book save(Book book, MultipartFile file, MultipartFile image) {
        Book dbBook = null;
        try {
            book.setAddedDate(new Date());
            book.setName(file.getOriginalFilename());
            dbBook = bookRepository.save(book);
            String fileSavePath = STORAGE_PATH + dbBook.getId() + "\\";
            dbBook.setFileUri("data\\" + dbBook.getId() + "\\" + file.getOriginalFilename());
            dbBook.setImageUri("data\\" + dbBook.getId() + "\\" + image.getOriginalFilename());
            if (file.getInputStream() != null) {
                FileUtil.createBookFolderById(fileSavePath);
                FileUtil.saveFile(file.getInputStream(), fileSavePath, file.getOriginalFilename());
            }
            if (image.getInputStream() != null) {
                FileUtil.saveFile(image.getInputStream(), fileSavePath, image.getOriginalFilename());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        bookRepository.save(dbBook);
        return dbBook;
    }

    @Override
    public Book findOne(Long id) {
        return bookRepository.findOne(id);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> getAllPdfBook() {
        return bookRepository.findByFileUriIsNotNull();
    }
}
