package com.company.HW_lesson_7.Task_6;

public class Aspirant extends Student {

        private String researchArticle;

        public Aspirant(String firstName, String lastName, String group, double averageMark, String researchArticle) {
                super(firstName, lastName, group, averageMark);
                this.researchArticle = researchArticle;
        }

        @Override
        public int getScholarship(double averageMark) {
                int scholarship;
                if (averageMark == 5.0){
                        scholarship = 200000;
                } else scholarship = 180000;
                return scholarship;
        }
}
