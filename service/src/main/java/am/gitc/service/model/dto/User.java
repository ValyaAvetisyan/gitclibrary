package am.gitc.service.model.dto;

import am.gitc.service.model.lcp.Gender;
import am.gitc.service.model.lcp.UserStatus;

import javax.persistence.*;

/**
 * Created by Zorik Zaqaryan on 08.03.2016.
 */
@Entity(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "age")
    private short age;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "userStatus")
    private UserStatus userStatus;


//    @OneToMany
//    @Column(name = "bookId")
//    List<Book> userBooks;
//

}
