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
    private String name;

    @Column(name = "category")
    private String category;

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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getReservedCount() {
        return reservedCount;
    }

    public void setReservedCount(int reservedCount) {
        this.reservedCount = reservedCount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
