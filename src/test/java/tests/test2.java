package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Rachel Ingles on 9/26/16.
 */
public class test2 {

    @Test
    public void method1(){
        System.out.println("method1");
        Assert.assertEquals(true,true);
        System.out.println("only");
    }

}