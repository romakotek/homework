package com.company.HW_lesson_6.Task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [][] element1 = new int [][]{
                new int []{1,2,3},
                new int []{4,5,6},
                new int []{7,8,9}
        };

        int [][] element2 = new int [][]{
                new int []{9,8,7},
                new int []{6,5,4},
                new int []{3,2,1}
        };

        Matrix matrix1 = new Matrix(element1);
        Matrix matrix2 = new Matrix(element2);
        System.out.println("Matrix #1 looks like this: \n" + matrix1 + '\n');
        System.out.println("Matrix #2 looks like this: \n" + matrix2 + '\n');

        Matrix result = matrix1.sum(matrix2);
        System.out.println("Bellow is given a matrix that was received from the sum of Matrix #1 and Matrix#2\n" + result);

        System.out.println("Enter the number that will increase the matrix:");
        int number = sc.nextInt();
        System.out.println("Matrix #1 increased by " + number + " looks like this one bellow:\n" + matrix1.multiplicationByNumber(number));
        System.out.println("Matrix #2 increased by " + number + " looks like this one bellow:\n" + matrix2.multiplicationByNumber(number));

    }
}
