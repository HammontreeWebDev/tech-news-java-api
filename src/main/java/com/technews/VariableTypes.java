package com.technews;

public class VariableTypes {
    public static void main(String[] args) {
        int myNumber = 20;
        double myDecimal = 5.5;
        String myString = "This is a cool string!";

//        add the int and double together and store as a double since it will end up being a decimal
        double sum = myNumber + myDecimal;
//        add the string and int together and store as String since one data type is a string
        String numString = myNumber + myString;
//        print the sum
        System.out.println(sum);
//        print the numString
        System.out.println(numString);
    }
}
