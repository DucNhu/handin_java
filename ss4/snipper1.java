package com.company.ss4;

public class snipper1 {
    public static void main(String[] args) {
        int first = 400, second = 700, result;
        result = first + second;
        if(result > 1000) {
            second = second + 100;
        }
        System.out.println("The value of second is" + second);
    }

}
