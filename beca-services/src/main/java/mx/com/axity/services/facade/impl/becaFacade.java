package mx.com.axity.services.facade.impl;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.services.facade.IbecaFacade;
import mx.com.axity.services.service.IbecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class becaFacade implements IbecaFacade {

    @Autowired
    private IbecaService becaService;

    public List<UserTO> getAllUsers() {
        return this.becaService.getUsers();
    }

    @Override
    public int operation(int num1, int num2) {
        int num3 = becaService.sum(num1,num2);
        num2 = becaService.minus(num3,num1);
        int num4 = becaService.multiplyX4(num2);
        return becaService.divideX4(num4);
    }
}
