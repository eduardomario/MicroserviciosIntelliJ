package mx.com.axity.services.facade;

import mx.com.axity.commons.to.UserTO;

import java.util.List;

public interface IbecaFacade {

    List<UserTO> getAllUsers();

    int operation(int num1, int num2);
}
