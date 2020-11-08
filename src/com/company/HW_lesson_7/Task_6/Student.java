package com.company.HW_lesson_7.Task_6;

public class Student {

    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student (String firstName, String lastName, String group, double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    //region GETTER/SETTERS
    public String getFirstName (){
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName (){
        return lastName;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }

    public String getGroup (){
        return group;
    }

    public void setGroup (String group){
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public double setAverageMark(double averageMark) {
        this.averageMark = averageMark;
        return averageMark;
    }
    //endregion

//    public int getScholarship (double averageMark){       // не получилось создать метод, определяющий
//        int scholarship;                                  // размер стипендии по средней оценке, которая
//        if (averageMark == 5.0) {                         // задавалась бы пользователем через консоль.
//            scholarship = 100000;
//        } else scholarship = 80000;
//        return scholarship;
//    }
    public int getScholarship (double averageMark){
        int scholarship;
        if (averageMark == 5.0){
            scholarship = 100000;
        } else scholarship = 80000;
        return scholarship;
    }

}
