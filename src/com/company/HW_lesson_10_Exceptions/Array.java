package com.company.HW_lesson_10_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Array {
    private int arrayLength;
    private int [] array;

    Scanner scan = new Scanner(System.in);

    public Array() {}

    public int defineTheLengthOfArray()throws InputMismatchException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Define the length of an array:");
            return sc.nextInt();
    }

    public int[] fillAndPrintArray(int arrayLength){
//        Scanner scan = new Scanner(System.in);
        System.out.println("Assign value to the items of your new created array: ");
//        this.array = array;
        int [] array = new int[arrayLength];
        for (int i = 0; i<array.length; i++){
           array[i] = scan.nextInt();
        }
        System.out.println("You have added an array thet contains: ");
        for (int integer:array){
            System.out.println(integer);
        }
        return this.array;
    }

    public void pickAndPrintAnElement(int[]array)throws InputMismatchException{
        System.out.println("Type the number of the element you want to print: ");
        int elementNumber = scan.nextInt();
        System.out.println("The element # " + elementNumber + " is " + array[elementNumber]);
    }


}
