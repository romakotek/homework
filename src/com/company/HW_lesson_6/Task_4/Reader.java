package com.company.HW_lesson_6.Task_4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Reader {


    String fullName;
    String libraryCardNumber;
    String faculty;
    String dateOfBirth;
    String phoneNumber;

    public Reader(String fullName, String libraryCardNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    Scanner sc = new Scanner(System.in);

    public void takeBook(int takenBooks) {
        System.out.println(fullName + " took " + takenBooks + " books");
    }

    public void takeBook(String [] amountOfTakenBooks) {        // здесь я хотел реализовать метод,
        for (int i = 0; i < amountOfTakenBooks.length; i++) {   // который позволил бы вводить в консоль
            System.out.println(amountOfTakenBooks[i]);          // названия книг в количестве, указанном в
                                                                // предыдущем методе (где заправшивается int takenBooks)
        }                                                       // НЕ ПОЛУЧАЕТСЯ
    }
}
