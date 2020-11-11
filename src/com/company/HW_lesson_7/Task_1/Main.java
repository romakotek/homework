package com.company.HW_lesson_7.Task_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> listOfColours = new ArrayList<>();
        while (true){
            String colour = sc.next();
            if (!colour.equals("#stop")){
                listOfColours.add(colour);
            } else break;
        }
        System.out.println(listOfColours);
    }
}
