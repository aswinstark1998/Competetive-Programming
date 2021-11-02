package com.aswin.dev;

/**
 * @author aswin
 * How to Run: javac BitWiseOperatorsInJava_001.java follwed by java BitWiseOperatorsInJava_001
 */
public class BitWiseOperatorsInJava_001 {
    /* Created by aswin on 11/2/2021 */


    public static void main(String[] args) {

        System.out.println("BITWISE AND, OR & XOR\n");
        int a = 5; //000.....0101
        int b = 3; //000.....0011

        System.out.println("a = 5\nb = 3\n");
        /*
            BITWISE AND
            0 0 0 0 ........ 0 1 0 1 = 5
          & 0 0 0 0 ........ 0 0 1 1 = 3
          ----------------------------
            0 0 0 0..........0 0 0 1 = 1

         */

        System.out.println("a & b: "+ (a&b));

        /*
            BITWISE OR
            0 0 0 0 ........ 0 1 0 1 = 5
          | 0 0 0 0 ........ 0 0 1 1 = 3
          ----------------------------
            0 0 0 0..........0 1 1 1 = 7

         */

        System.out.println("a | b: "+ (a^b));
        /*
            BITWISE XOR
            0 0 0 0 ........ 0 1 0 1 = 5
          ^ 0 0 0 0 ........ 0 0 1 1 = 3
          ----------------------------
            0 0 0 0..........0 1 1 0 = 6

         */

        System.out.println("a ^ b: "+ (a^b));
    }
}
