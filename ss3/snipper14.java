package com.company.ss3;

import java.util.Scanner;

public class snipper14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int intValue = s.nextInt();
        System.out.println("Enter a decimal number: ");
        float floatNumber = s.nextFloat();
        System.out.println("Enter a String value: ");
        String strValue = s.next();
        System.out.println("Values entered are: ");
        System.out.println(intValue + " " + floatNumber + " " + strValue);
    }
}
