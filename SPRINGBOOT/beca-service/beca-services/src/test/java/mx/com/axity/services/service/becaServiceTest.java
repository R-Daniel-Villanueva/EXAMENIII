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
        int num1=5;
        int num2=10;
        int result=this.becaService.sum(num1,num2);
        Assert.assertEquals(15,result);
    }
    @Test
    public void shouldReturnThesubstractionOfretultlessnum1(){
        int num1=5;
        int num2=10;
        int sum=this.becaService.sum(num1,num2);
        int result =this.becaService.subtraction(sum,num1);
        Assert.assertEquals(10,result);
    }
    @Test
    public void shouldReturnThemultiplicationOfNum1x4(){
        int num1=5;
        int mul=this.becaService.multiplication(num1);
        Assert.assertEquals(20,mul);
    }
    @Test
    public void shouldReturnTheDivisionOfretultentre4(){
        int num1=5;
        int num2=10;
        int sum=this.becaService.sum(num1,num2);
        int result =this.becaService.division(sum);
        Assert.assertEquals(3,result);
    }
}
