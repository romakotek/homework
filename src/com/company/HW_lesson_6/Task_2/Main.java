package com.company.HW_lesson_6.Task_2;


public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person("Elisabeth Harmon", 21);

        person1.setFullName("Nigel Dows");
        person1.setAge(28);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();

        System.out.println(person1);
        System.out.println(person2);
    }
}
