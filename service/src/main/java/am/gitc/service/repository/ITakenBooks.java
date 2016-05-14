package am.gitc.service.repository;

import am.gitc.common.model.entity.TakenBooks;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Zorik Zaqaryan on 15.03.2016.
 */
public interface ITakenBooks extends PagingAndSortingRepository<TakenBooks, Long> {

//    @Query(value = "select count(b) from TakenBooks b where b.status = ?1")
//    int findByStatus(int status);


//    @Query(value = "select '*' from TakenBooks b where b.status = ?1")
//    List<TakenBooks> findAllByStatus(int status);
}
