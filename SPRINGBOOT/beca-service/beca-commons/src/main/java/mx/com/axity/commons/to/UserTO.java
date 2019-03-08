package mx.com.axity.commons.to;

import java.io.Serializable;

public class UserTO implements Serializable {//serializable

    public UserTO() {

    }

    private Long id;

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

    private String user;
    private String pass;

}
