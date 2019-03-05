package mx.com.axity.services.facade;

import mx.com.axity.commons.to.UserTO;

import java.util.List;

public interface IbecaFacade {

    int operation(int num1, int num2);

    List<UserTO> getAllUsers();

    void saveUser(UserTO userTO);

    void deleteUser(Long id);

    UserTO findUser(Long id);

    void updateUser(UserTO userTO);
}
