package com.company.HW_lesson_10_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Array {

    int arrayLength;
    int [] arrayWithExceptions;

    public Array (){

    }
    Scanner sc = new Scanner (System.in);
    public void defineTheLengthOfAnArray () throws InputMismatchException {

        System.out.println("Definieren Sie bette die Lenge von Array:");
        this.arrayLength = sc.nextInt();

    }
    public void createAnArray () throws InputMismatchException{

        arrayWithExceptions = new int[this.arrayLength];
        System.out.println("Geben Sie bitte die Werte der Array-Elementen nacheinander:");
        for (int i = 0; i < arrayWithExceptions.length; i++){
            arrayWithExceptions[i] = sc.nextInt();
        }
    }
}
