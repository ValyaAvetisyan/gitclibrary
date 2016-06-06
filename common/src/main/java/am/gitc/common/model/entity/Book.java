package am.gitc.common.model.entity;


import org.hibernate.validator.constraints.NotEmpty;

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
    @NotEmpty
    private String name;

    @Column(name = "category")
    private String category;

    @Column(name = "imageUri")
    private String imageUri;

    @Column(name = "fileUri")
    private String fileUri;

    @Column(name = "author")
    @NotEmpty
    private String author;

    @Column(name = "addedDate")
    private Date addedDate;

    @Column(name = "count")
    private Integer count;

    @Column(name = "reservedCount")
    private Integer reservedCount;

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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getReservedCount() {
        return reservedCount;
    }

    public void setReservedCount(Integer reservedCount) {
        this.reservedCount = reservedCount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFileUri() {
        return fileUri;
    }

    public void setFileUri(String fileUri) {
        this.fileUri = fileUri;
    }
}
