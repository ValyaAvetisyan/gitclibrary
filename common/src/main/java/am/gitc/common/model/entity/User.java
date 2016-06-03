package am.gitc.common.model.entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.*;

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
    @Size(min = 2, max = 30, message = "Name size must be between 2 and 30")
    private String name;

    @Column(name = "surname")
    @Size(min = 2, max = 30, message = "Surname size must be between 2 and 30")
    private String surname;

    @Column(name = "email")
    @NotEmpty(message = "Email is Required")
    @Email
    private String email;

    @Column(name = "password")
    @Length(min = 4, max = 12, message = "Password length must be between 4 and 12")
    private String password;

    @Column(name = "age")
    @NotNull(message = "Age is Required")
    @Min(value = 7, message = "Age can be started 7")
    @Max(value = 60, message = "Age can't be great than 60")
    private Short age;

    @Column(name = "role_id")
    @Convert(converter = RoleEnum.RoleConverter.class)
    private RoleEnum role;

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }
}
