package mx.com.axity.services.service.impl;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.UserDO;
import mx.com.axity.persistence.UserDAO;
import mx.com.axity.services.service.IbecaService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.reflect.Type;
import java.util.List;

@Service
public class becaServiceImpl implements IbecaService {

    static final Logger LOG = LogManager.getLogger(becaServiceImpl.class);

    @Autowired
    UserDAO userDAO;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public int sum(int sum1, int sum2) {
        return sum1 + sum2;
    }

    @Override
    public int minus(int minus1, int minus2) {
        return minus1 - minus2;
    }

    @Override
    public int multiplyX4(int multiply1) {
        return multiply1*4;
    }

    @Override
    public int divideX4(int divide1) {
        return divide1/4;
    }

    @Override
    public List<UserDO> getAllUsers() {
        return (List<UserDO>) this.userDAO.findAll();
    }
}
