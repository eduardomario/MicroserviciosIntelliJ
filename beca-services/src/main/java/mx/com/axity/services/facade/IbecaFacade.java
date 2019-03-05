package mx.com.axity.services.facade;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.UserDO;

import java.util.List;
import java.util.Optional;

public interface IbecaFacade {

    int operation(int num1, int num2);

    List<UserTO> getAllUsers();

    void saveUser(UserTO userTO);

    void deleteUser(UserTO userTO);

    Optional<UserDO> findUser(UserTO userTO);
}
