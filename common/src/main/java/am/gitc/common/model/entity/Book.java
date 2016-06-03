package am.gitc.common.model.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Zorik Zaqaryan on 08.03.2016.
 */
@Entity
public class Book implements Serializable {

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

    public void setName(String name) {
        this.name = name;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setReservedCount(int reservedCount) {
        this.reservedCount = reservedCount;
    }
}
