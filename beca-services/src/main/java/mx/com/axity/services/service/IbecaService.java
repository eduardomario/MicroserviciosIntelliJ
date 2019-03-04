package mx.com.axity.services.service;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.UserDO;

import java.util.List;

public interface IbecaService {

    int sum(int sum1, int sum2);

    int minus(int minus1, int minus2);

    int multiplyX4(int multiply1);

    int divideX4(int divide1);

    List<UserDO> getAllUsers();
}
