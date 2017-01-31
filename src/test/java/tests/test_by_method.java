package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Rachel Ingles on 9/26/16.
 */
public class test_by_method {

    @Test
    public void method1(){
        System.out.println("method1");
        assert_true();
        assert_false();
        System.out.println("only");
    }

    @Test
    public void method2(){
        System.out.println("method2");
        assert_false();
        System.out.println("only");
    }

    @Test
    public void method3(){
        System.out.println("method2");
        assert_true();
        System.out.println("only");
    }


    private void assert_true(){
        Assert.assertEquals(true,true);
    }

    private void assert_false(){
        Assert.assertEquals(true,false);
    }
}