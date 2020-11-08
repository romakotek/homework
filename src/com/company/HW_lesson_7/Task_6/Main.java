package com.company.HW_lesson_7.Task_6;

//        Создайте пример наследования, реализуйте класс Student и класс Aspirant,
//        аспирант отличается от студента наличием некой научной работы.
//        а) Класс Student содержит переменные: String firstName, lastName, group.
//           А также double averageMark, содержащую среднюю оценку.
//        б) Создать переменную типа Student, которая ссылается на объект типа Aspirant.
//        в) Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
//           Если средняя оценка студента равна 5, то сумма 100 000 тенге, иначе 80 000.
//           Переопределить этот метод в классе Aspirant.  Если средняя оценка аспиранта равна 5, то сумма 200 000 тенге, иначе 180 000.
//        г) Создать массив типа Student, содержащий объекты класса Student и Aspirant.
//           Вызвать метод getScholarship() для каждого элемента массива.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student [] listOfAllStudents = new Student[2];

        Student student1 = new Student("Erjan", "Burabayev","B2-22", 5.0);
        Aspirant aspirant1 = new Aspirant("Gilliolme", "Debailly", "B1-32",4.9, "Possibilities of using Cobit 4.1 for IT-auditors");
        listOfAllStudents [0] = student1;
        listOfAllStudents [1] = aspirant1;

//        System.out.println("Enter the average mark of " + student1.getLastName());      // не получилось создать метод, определяющий
//        double averageMark = student1.setAverageMark(sc.nextDouble());                  // размер стипендии по средней оценке, которая
//        int stipendia = student1.getScholarship(averageMark);                           // задавалась бы пользователем через консоль.
//        System.out.println(stipendia);

        System.out.println(student1.getLastName() + " get a " + student1.getScholarship( 4.0) + " scholarship");
        System.out.println(aspirant1.getLastName() + " get a " + aspirant1.getScholarship(5.0) + " scholarship");


    }
}
