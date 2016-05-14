package am.gitc.common.model.entity;


import javax.persistence.*;
import java.util.Date;

/**
 * Created by Zorik Zaqaryan on 08.03.2016.
 */
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    String name;

//    @Column(name = "category")
//    @Enumerated(EnumType.STRING)
//    private Category category;

    @Column(name = "imageUri")
    private String imageUri;

    @Column(name = "author")
    private String author;

    @Column(name = "addedDate")
    private Date addedDate;

    @Column(name = "count")
    private int count;

    @Column(name = "reservedCount")
    private int reservedCount;

//    @Column(name = "status")
//    @Convert
//    private int status;
}
