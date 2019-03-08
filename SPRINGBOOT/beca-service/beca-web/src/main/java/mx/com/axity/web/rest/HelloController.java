package mx.com.axity.web.rest;

import io.swagger.annotations.Api;
import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.UserDO;
import mx.com.axity.services.facade.IbecaFacade;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
@RequestMapping("beca")
@Api(value="beca", description="Operaciones con beca")
public class HelloController {

    static final Logger LOG = LogManager.getLogger(HelloController.class);

    //@Autowired
    //RestTemplate restTemplate;
////////////////////////////////////////////////////////////////////////////////////////7
    @Autowired
    IbecaFacade IbecaFacade;
    //METODO PARA CONSULTAR TODOS LOS REGISTROS EXISTENTES
    @RequestMapping(value = "/login", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<UserTO>> getAllLogin() {
        LOG.info("Se invoca /login");
        List<UserTO> users = this.IbecaFacade.getAllLogin();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    //METODO PARA COSNULTAR UN REGISTRO EN BASE A SU ID
    @RequestMapping(value = "/idlogin", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<UserTO> getIdLogin(@RequestParam(value="id")long id) {
        LOG.info("Se invoca /idlogin");
        LOG.info(id);
        UserTO users = this.IbecaFacade.getIdLogin((long) id);
        if(users.getId()!=null){
            return new ResponseEntity<>(users, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    //METODO PARA ELIMINAR UN REGISTRO EN BASE A SU ID
    @RequestMapping(value = "/deletelogin", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<UserTO> deleteLogin(@RequestParam(value="id")long id) {
        LOG.info("Se invoca /deletelogin");
        LOG.info(id);
        this.IbecaFacade.deleteLogin(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    //METODO PARA GUARDAR UN REGISTRO EN BASE A SU ID
    @RequestMapping(value = "/savelogin", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<UserTO> insertLogin(@RequestBody UserDO userDO) {
        LOG.info("Se invoca /savelogin");
        LOG.info(userDO);
        if(userDO.getPass()!=null&&userDO.getUser()!=null){
            this.IbecaFacade.insertLogin(userDO);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    //METODO PARA ACTUALIZAR UN REGISTRO EN BASE A SU ID
    @RequestMapping(value = "/updatelogin", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity<UserTO> updateLogin(@RequestBody UserDO userDO) {
        LOG.info("Se invoca /updatelogin");
        LOG.info(userDO);
        if(userDO.getId()!=null&&userDO.getUser()!=null&&userDO.getPass()!=null){
            this.IbecaFacade.updateLogin(userDO);
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }
    }
}
