package com.xsj.algorithm;


public class Test1 {


    /**
     *
     * 题目描述
     *
     *   给定一个整数 (32 位有符号整数)，请编写一个函数来判断它是否是 4 的幂次方。
     * 示例 1:
     *
     *          输入: 16
     *          输出: true
     *          示例 2:
     *
     *          输入: 5
     *          输出: false
     *  进阶：
     *  你能不使用循环或者递归来完成本题吗？
     *
     *
     *  基于二进制的规律 来解答此题   按照hashMap中的与运算操作规律， 2的n次方-1  的二进制码 每位都是1
     *
     *  由此规律可以得出  4的 n次方-1 的二进制码 每位 也是1  并且 个数是 大于2 的偶数位
     *
     *  可以基于此方式来完成进阶操作
     *
     *
     **/
    public boolean isPowerOfFour(int num) {


        if(num<1 ||num==2){
            return false;
        }


        if(num==1){
            return true;
        }


        String binaryStr =  Integer.toBinaryString(num-1);


        if(binaryStr.length()%2!=0){

            return false;
        }

        for(int i=0;i<binaryStr.length();i++){

            if(binaryStr.charAt(i)!='1'){
                return false;
            }
        }
        return true;


    }




}
