package mx.com.axity.services.service;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.services.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class becaServiceTest extends BaseTest {

    @Test
    public void exampleTest() {

        List<UserTO> users = this.becaService.getUsers();

        Assert.assertEquals(1, users.size());
    }

    @Test
    public void shouldReturnTheSumOfTwoNumbers(){
        int num1 = 5;
        int num2 = 10;
        int result = this.becaService.sum(num1, num2);

        Assert.assertEquals(15, result);
    }

    @Test
    public void shouldReturnTheSubstractionOfTwoNumbers(){
        int num1 = 15;
        int num2 = 10;
        int result = this.becaService.minus(num1, num2);

        Assert.assertEquals(5, result);
    }

    @Test
    public void shouldReturnTheMultiplicationOfOneNumberAndFour(){
        int num1 = 5;
        int result = this.becaService.multiplyX4(num1);

        Assert.assertEquals(20, result);
    }

    @Test
    public void shouldReturnTheDivisionOfOneNumberAndFour(){
        int num1 = 40;
        int result = this.becaService.divideX4(num1);

        Assert.assertEquals(10, result);
    }
}
