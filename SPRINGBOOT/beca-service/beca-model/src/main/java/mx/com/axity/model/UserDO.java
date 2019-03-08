package mx.com.axity.model;

import javax.persistence.*;

@Entity
@Table(name = "login", schema = "public")
public class UserDO {

    @Id//PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="loginSeq")//Autoincrement
    @SequenceGenerator(name="loginSeq", sequenceName="login_id_seq", allocationSize=1)
    @Column(name = "id")
    private Long id;
    @Column(name = "ds_user")
    private String user;
    @Column(name = "ds_pass")
    private String pass;
    protected UserDO() {
    }

    public UserDO(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }


}
