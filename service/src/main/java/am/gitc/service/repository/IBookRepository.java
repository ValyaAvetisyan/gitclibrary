package am.gitc.service.repository;

import am.gitc.common.model.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Zorik Zaqaryan on 15.03.2016.
 */
public interface IBookRepository extends PagingAndSortingRepository<Book, Long> {

    @Override
    Page<Book> findAll(Pageable pageable);

    @Override
    Book save(Book s);

    @Override
    Book findOne(Long aLong);

//    @Query(value = "select count(b) from Book b where b.name = ?1")
//    int findByName(String name);

//    @Query(value = "select '*' from Book b where b.name = ?1")
//    List<Book> findByName(Book name);
//
//    @Override
//    boolean exists(Long aLong);
//
//    @Override
//    long count();
//
//    @Override
//    void delete(Long aLong);
//
//    @Override
//    void delete(Book book);
}
