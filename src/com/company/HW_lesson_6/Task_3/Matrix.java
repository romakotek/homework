package com.company.HW_lesson_6.Task_3;

import java.util.Scanner;


public class Matrix {

    private int [][] elements;
    private int rows;
    private int columns;

    public Matrix (int [][] elements){
        this.elements = elements;
        rows = elements.length;
        columns = rows;
    }

    // region GETTERS/SETTERS

    public int[][] getElements() {
        return elements;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
    //endregion
    //region METHODS

    public Matrix sum (Matrix matrix){
        int[][] arr =new int [rows][];

        for (int i = 0; i < arr.length; i++){
            int [] temp = new int[columns];
            for (int j = 0; j<temp.length; j++){
                temp[j] = matrix.getElements()[i][j] +this.getElements()[i][j];
            }
            arr[i] = temp;
        }
        return new Matrix (arr);
    }

    /*Метод умножения матрицы на число. Задано на дом*/
    public Matrix multiplicationByNumber (int number){
        int[][] arr =new int [rows][];

        for (int i = 0; i < arr.length; i++){
            int [] temp = new int[columns];
            for (int j = 0; j<temp.length; j++){
                temp[j] = number * this.getElements()[i][j];
            }
            arr[i] = temp;
        }
        return new Matrix (arr);
    }

    @Override
    public String toString() {
        String e = "";
        for (int i = 0; i<elements.length;i++){
            for (int j = 0; j<elements[i].length; j++){
                e = e + elements[i][j] + " ";
            }
            e = e + '\n';
        }
        return "{\n" + e + '}';
    }
}
