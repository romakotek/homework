package com.company.HW_lesson_10_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arrayLength = defineTheLengthOfArray();
        System.out.println("The length of your array is " + arrayLength + "\n--------------------\n");

        fillArray(arrayLength);
        showArray(arrayLength);
//        try{
//            pickItemsFromArray();
//        }catch(InputMismatchException e){
//            System.out.println("Type some INTEGER");
//        }




    }

    private static int defineTheLengthOfArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Define the length of an array:");
        try{
            return sc.nextInt();
//            System.out.println("The length of your array is");
        }catch(InputMismatchException e){
            System.out.println("To define the length of an array you have to enter some INTEGER");
            return defineTheLengthOfArray();
        }
    }

    private static int fillArray(int arrayLeng){
        Scanner scan = new Scanner(System.in);
        System.out.println("Assign value to the items of your new created array: ");
        int [] array = new int[arrayLeng];
        for (int i = 0; i<array.length; i++){
           array[i] = scan.nextInt();
        }
        return array[arrayLeng];
    }

    private static void showArray(int arrLeng){
        int [] arr = new int[arrLeng];
        System.out.println("You have added an array that contains: ");
        for (int i = 0; i<arr.length; i++){
            System.out.print("\t" + arr[i]);
        }
    }

    private static int pickItemsFromArray() throws InputMismatchException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Which items would you like to pick from array?");
        return scan.nextInt();
    }



}
