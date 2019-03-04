package mx.com.axity.services.service;

import mx.com.axity.commons.to.UserTO;
import java.util.List;

public interface IbecaService {

    List<UserTO> getUsers();

    int sum(int sum1,int sum2);
    int subtraction (int sum1,int num1);
    int multiplication(int num);
    int division(int numtodiv);
}

