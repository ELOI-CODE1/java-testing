package com.example;

public class App {
    
    public int addTwoNumbers(int a,int b){
        return a+b;
    }
    public String gradingMarks(int [] marks){

        int sum=0;

        if (marks.length == 0) {
            return "Empty array";
        }else{
            for (int i=0;i<marks.length;i++){
                sum +=marks[i];
                }
        }

        int average = sum/marks.length;

        if (average >= 90) {
            return "A";
        }else if (average >= 80 && average <90) {
            return "B";
        }else if (average >= 70 && average < 80) {
            return "C";
        }else if (average >= 60 && average < 70) {
            return "D";
        }else if (average >= 50 && average < 60) {
            return "E";
        }else if (average < 50){
            return "F";
        }else{
            return "Invalid array";
        }
    }
    public String ageChecker(String gender, int age){
        if (age<8 && gender=="female") {
            return "Hello baby girl";
        }else if (age<8 && gender == "boy") {
            return "Hello baby boy";
        }else if (age < 18 && gender == "female") {
            return "Hello young lady";
        }else if (age < 18 && gender == "male" ) {
            return "Hello young boy";
        }else if (age <35 && gender == "female") {
            return "Hello my lady";
        }else if (age <35 && gender == "male") {
            return "Hello my Man";
        }else if (age > 35 && gender == "female") {
            return "Hello maam";
        }else if (age > 35 && gender == "male") {
            return "Hello sir";
        }
        else{
            return "Incorrect input message";
        }
    }
    
}
