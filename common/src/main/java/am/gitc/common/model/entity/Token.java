package am.gitc.common.model.entity;

import am.gitc.common.model.entity.User;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "token")
//@NamedQuery(name = "findByToken",
//        query = "SELECT t FROM Token t WHERE  t.value = :token AND type = :type")
public class Token implements Serializable {

    public enum TokenType {
        COMMUNICATION,
        CONFIRMATION,
        RESET_PASS;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

//    @Column(name = "type")
//    @Convert(converter = TokenTypeConverter.class)
//    private TokenType type;

    @Column(name = "value")
    private String value;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

//    public TokenType getType() {
//        return type;
//    }

//    public void setType(TokenType type) {
//        this.type = type;
//    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
