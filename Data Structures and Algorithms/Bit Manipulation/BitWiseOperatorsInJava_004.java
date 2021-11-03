package com.aswin.dev;

/**
 * @author aswin
 *
 * Given an array of n numbers that has values in range [1... n+1]. Every number appears exacly once.
 * Hence one number is missing. Find the missing number.
 */
public class BitWiseOperatorsInJava_004 {
    /* Created by aswin on 11/3/2021 */

    /*
        Logic: a^0 = a
               a^a = 0
               a^(b^c) = (a^b)^c;
     */

    public static  int findMissingNumber(int[] array){
        int n = 0;
        for(int i=1; i<=array.length+1; i++){
            n = i^n;
        }
        for(int i=0; i<array.length; i++){
            n = array[i]^n;
        }
        return n;
    }
    public static void main(String[] args) {

        System.out.println("FIND THE MISSING NUMBERS IN [1, 2, ....n+1]\n");

        int a[] = {1, 4, 3}; // 2 is missing
        int b[] = {1, 5, 3, 2}; // 4 is missing

        System.out.println("Missing value in a[] " + findMissingNumber(a));
        System.out.println("Missing value in b[] " + findMissingNumber(b));
    }
}
