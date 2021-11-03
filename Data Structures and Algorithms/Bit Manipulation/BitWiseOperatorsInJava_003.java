package com.aswin.dev;

/**
 * @author aswin
 * How to Run: javac BitWiseOperatorsInJava_003.java follwed by java BitWiseOperatorsInJava_003
 *
 * Program to find number of set bits in binary representation of a number.
 */
public class BitWiseOperatorsInJava_003 {
    /* Created by aswin on 11/3/2021 */

    //Efficient Approach O(no. of set bit count)
    public static int numberOfSetBits(int n){
        int setBitCount = 0;

        while(n>0){
            n = n&(n-1);
            setBitCount++;
        }
        return  setBitCount;
    }
    public static void main(String[] args) {

        System.out.println("COUNT SET BITS\n");
        int a = 5; //000.....0101 = 2 set bits
        int b = 3; //000.....0011 = 2 set bits
        int c = 15; // 000....1011 = 4 set bits

        System.out.println("Set bits in "+a +" = "+ numberOfSetBits(a));
        System.out.println("Set bits in "+b +" = "+ numberOfSetBits(b));
        System.out.println("Set bits in "+c +" = "+ numberOfSetBits(c));
    }
}
