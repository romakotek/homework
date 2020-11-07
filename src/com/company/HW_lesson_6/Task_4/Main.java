package com.company.HW_lesson_6.Task_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Reader [] arrayOfReaders = new Reader[2];
        Reader reader1 = new Reader("Petrenko","F8745","Software Ingineering","11.11.1986","7015380377");
        Reader reader2 = new Reader("Letvinenko","B8745","Law","10.03.1986","70100000001");
        arrayOfReaders[0] = reader1;
        arrayOfReaders[1] = reader2;

        System.out.println("How many books would you like to borrow?");
        int amountOfTakenBooks = sc.nextInt();
        reader1.takeBook(amountOfTakenBooks);

        String [] namesOfTakenBooks = new String[amountOfTakenBooks];

        System.out.println("Which books do you want to borrow?");
        reader1.takeBook(namesOfTakenBooks);
        for (int i = 0; i < namesOfTakenBooks.length; i++){
            namesOfTakenBooks[i] = sc.nextLine();
        }


    }
}
