package am.gitc.common.model.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Zorik Zaqaryan on 14.03.2016.
 */
@Entity
public class TakenBooks {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "taken_date")
    private Date takenDate;

    @Column(name = "end_date")
    private Date endDate;


}
