package com.company.HW_lesson_10_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Array arr = new Array();
        try{
            arr.defineTheLengthOfAnArray();
        }catch (InputMismatchException e){
            System.out.println("Um die Lenge von Array zu definieren, soll es eine Zahl gegeben werden sein.");
            arr.defineTheLengthOfAnArray();
        }
        try{
            arr.createAnArray();
        }catch (InputMismatchException e){
            System.out.println("Es wurde keine Zahl gegeben. Geben Sie eine Zahl, bitte.");
        }
    }
}
