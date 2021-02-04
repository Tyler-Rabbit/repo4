package com.tyler.test;

import com.tyler.calc.Calc;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalcTest {
    @Before
    public void init(){
        System.out.println("before");
    }
    @After
    public void close(){
        System.out.println("After");
    }
    @Test
    public void testAdd(){
        Calc calc = new Calc();
        int result = calc.add(1, 2);
        Assert.assertEquals(3,result);
    }

    @Test
    public void testSub(){
        Calc calc = new Calc();
        int result = calc.sub(1, 2);
        Assert.assertEquals(-1,result);
    }
}
