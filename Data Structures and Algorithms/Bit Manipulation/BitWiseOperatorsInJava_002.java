package com.aswin.dev;

/**
 * @author aswin
 * How to Run: javac BitWiseOperatorsInJava_002.java follwed by java BitWiseOperatorsInJava_002
 *
 * Program to find number of set bits in binary representation of a number.
 */
public class BitWiseOperatorsInJava_002 {
    /* Created by aswin on 11/2/2021 */


    //Naive Approach = O(n) solution
    public static int numberOfSetBits(int n){
        int setBitCount = 0;

        while(n>0){
            if((n&1)==1){
                setBitCount++;
            }
            n=n>>1;
        }
        return  setBitCount;
    }

    public static void main(String[] args) {

        System.out.println("COUNT SET BITS\n");
        int a = 5; //000.....0101 = 2 set bits
        int b = 3; //000.....0011 = 2 set bits
        int c = 11; // 000....1011 = 3 set bits

        System.out.println("Set bits in "+a +" = "+ numberOfSetBits(a));
        System.out.println("Set bits in "+b +" = "+ numberOfSetBits(b));
        System.out.println("Set bits in "+c +" = "+ numberOfSetBits(c));
    }
}
