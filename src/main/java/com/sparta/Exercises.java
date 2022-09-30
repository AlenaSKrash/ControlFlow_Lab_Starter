package com.sparta;

public class Exercises {

    // returns the average of the array nums
    public static double average(int[] nums)
    {
        double sum = Double.MIN_VALUE;
        if (nums.length == 0){
            return 0;
        }

        for (double n : nums){
            sum = sum + n;
        }
        return sum/nums.length;
    }

    // returns the type of ticket a customer is eligible for based on their age
    // "Standard" if they are between 18 and 59 inclusive
    // "OAP" if they are 60 or over
    // "Student" if they are 13-17 inclusive
    // "Child" if they are 5-12
    // "Free" if they are under 5
    public static String ticketType(int age)
    {
        String ticketType;
        if (age >= 18 && age <= 59){
            ticketType = "Standard";
        }
        else if (age >= 60) {
            ticketType = "OAP";
    }
        else if (age >= 13 && age <=17){
            ticketType = "Student";
        } else if (age >= 5 && age <= 12){
            ticketType = "Child";
        }
        else {
            ticketType = "Free";
        }
        return ticketType;
    }

//    public static String grade(int mark)
//    {
//        String grade;
//        if (mark >=75 && mark <=100){
//            grade = "Pass with Distinction";
//        }
//        else if (mark >= 60 && mark <= 74){
//            grade = "Pass with Merit";
//        }
//        else if (mark >= 40 && mark <=59) {
//            grade = "Pass";
//        }
//        else {
//            grade = "Fail";
//    }
//        return grade;
//    }
//
//    public static int getScottishMaxWeddingNumber(int covidLevel)
//    {
//        return 0;
//    }
//      public static String grade(int mark){
//        String grade = "";
//        if (mark >=75){
//            if(mark <=100) {
//                grade = "Pass with Distinction";
//            }
//            }
//        if (mark >=60){
//            if (mark <=74) {
//                grade = "Pass with Merit";
//            }
//            }
//        if (mark >=40){
//            if (mark <=59) {
//                grade = "Pass";
//            }
//            }
//        if (mark >=0)
//            if (mark <= 39){
//                grade = "Fail";
//        }
//        return grade;
//      }

    public static String grade(int mark)
    {
        String grade;
        if (mark < 40)
            grade = "Fail";
        else {
            grade = "Pass";
            if (mark >= 75)
                grade += " with Distinction";
            else if (mark >= 60)
                grade += " with Merit";
        }
        return grade;
    }

    public static int checkMaxAttendees(int level){
        int maxAttendees = 0;
        switch(level) {
            case 4 -> maxAttendees += 20;
            case 2, 3 -> maxAttendees += 50;
            case 1 -> maxAttendees += 100;
            case 0 -> maxAttendees += 200;
            default -> maxAttendees += 0;
        }
        return maxAttendees;
    }

}
