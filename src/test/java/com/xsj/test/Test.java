package com.xsj.test;


import com.xsj.algorithm.Test1;

public class Test {


    @org.junit.Test
    public void testisPowerOfFour(){


        Test1 test1 = new Test1();

        assert test1.isPowerOfFour(16);
    }


}
