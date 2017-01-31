package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Rachel Ingles on 9/26/16.
 */
public class test1 {

    @Test
    public void method1(){
        System.out.println("method1");
        Assert.assertEquals(true,true);
        System.out.println("only");
    }

    @Test
    public void method2(){
        System.out.println("method2");
        Assert.assertEquals(true,false);
        System.out.println("only");
    }

    @Test
    public void method3(){
        System.out.println("method2");
        Assert.assertEquals(true,true);
        System.out.println("only");
    }
}