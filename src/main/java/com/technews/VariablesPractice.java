package com.technews;

public class VariablesPractice {
    public static void main(String[] args) {
//        declare all variables
        int seven = 7;
        double threeFourths = 0.75;
        String studentName = "Josie";

//        the sum is a double because one var is an int and one is a double
        double firstSum = seven + threeFourths;
//        answer : 7.75
        System.out.println(firstSum);

//        store secondSum as a string since one data type is a string. . .
        String secondSum = seven + studentName;
//        answer: "7Josie"
        System.out.println(secondSum);
    }
}
