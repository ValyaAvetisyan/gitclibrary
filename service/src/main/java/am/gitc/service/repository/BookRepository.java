package am.gitc.service.repository;

import am.gitc.common.model.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by Zorik Zaqaryan on 15.03.2016.
 */
public interface BookRepository extends PagingAndSortingRepository<Book, Long> {

    @Override
    Page<Book> findAll(Pageable pageable);

    @Override
    Book save(Book s);

    @Override
    Book findOne(Long id);

    @Override
    List<Book> findAll();

    //    @Query(value = "SELECT * from Book b WHERE b.fileUri IS NOT NULL")
    List<Book> findByFileUriIsNotNull();

}
