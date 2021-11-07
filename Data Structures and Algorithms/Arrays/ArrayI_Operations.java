package com.aswin.dev;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Aswin. A
 *
 * Array Operations - insert/delete/search
 */
public class ArrayI_Operations {
    /* Created by Aswin on 11/7/2021 */
    public static void main(String[] args) {
        int array[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Scanner scanner = new Scanner(System.in);
        System.out.println("LINEAR SEARCH");
        drawLine(30);
//
//        System.out.print("Enter element to be searched: Array = { 1, 2, 3, 4, 5, 6, 7, 8, 9}: ");
//        int element = scanner.nextInt();
//        System.out.println("Element "+element+" found at position: "+ linearSearch(array, element));
//
//        drawLine(50);

        ArrayList<Integer> intArray = new ArrayList<>();
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        intArray.add(4);
        intArray.add(5);
        intArray.add(6);
        intArray.add(7);
        intArray.add(8);
        intArray.add(9);

        System.out.println(intArray);

        System.out.print("Enter element to add : ");
        int elementToAdd = scanner.nextInt();
        System.out.print("Enter position to insert : ");
        int position = scanner.nextInt();

        System.out.println("Element inserted at: "+insertIntoArray(intArray, elementToAdd, position));
        System.out.println(intArray);

    }

    private static int insertIntoArray(ArrayList<Integer> array, int elementToAdd, int position) {
//        if(position>array.size()){
//            System.out.println("Insertion not possible");
//            return -1;
//        }
//        for(int i=array.size()-1; i>=position; i--){
//            array.add(i+1, array.get(i));
//        }
        array.add(position, elementToAdd);
        return position;
    }

    public static void drawLine(int n) {
        for(int i=0;i<n; i++){
            System.out.print("-");
        }
        System.out.println();
    }
    public static int linearSearch(int array[], int element){
        for(int i=0; i<=array.length-1; i++){
            if(array[i] == element){
                return i+1;
            }
        }
        return -1;
    }
}
