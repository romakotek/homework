package com.company.HW_lesson_10_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

//Создать массив из int, предварительно спросив размер(тут 1 ошибка, обработать что ПЗ введет не число).
// Рандомно заполнить массив, напечатать на экране
// После спросить у ПЗ порядковый номер элемента(2 и 3 ошибка) и вывести данный элемент.



public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Array obj = new Array();
        int arrayLength;

        /*1-й метод. Определдение длинны массива*/
        try{
            arrayLength = obj.defineTheLengthOfArray();
        }catch(InputMismatchException e){
            System.out.println("To define the length of an array you have to enter some INTEGER");      //Что-то оне то с рекурсией.
            arrayLength = obj.defineTheLengthOfArray();                                                 //После второго неправильного ввода
        }                                                                                               //выходит InputMismatchException
        System.out.println("The length of your array is " + arrayLength + "\n--------------------\n");


        /*2-й метод. Присваивание значений элементам массива*/
        int [] array = obj.fillAndPrintArray(arrayLength);

        /*3-й метод. Вывод элементов массива на консоль*/
        try{
            obj.pickAndPrintAnElement(array);                   //В этом методе тоже проблема с рекурсией.
        }catch(InputMismatchException e){                       //После однократного неправтльного ввода (char или String вместо int)
            System.out.println("Please, type some INTEGER");    //программа выбрасывает InputMismatchException
            obj.pickAndPrintAnElement(array);
        }
    }
}
