package mx.com.axity.services.facade;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.UserDO;

import java.util.List;

public interface IbecaFacade {

    List<UserTO> getAllLogin();
    UserTO getIdLogin(Long id);
    void deleteLogin(Long id);
    void insertLogin(UserDO loginDO);
    void updateLogin(UserDO loginDO);

}
