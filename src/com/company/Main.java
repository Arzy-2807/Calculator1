package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers,with operator(+,-,*,/) between them:");
        String input = sc.nextLine();

        if (input.contains("I") || input.contains("V") || input.contains("X")) {

            //For roman numbers
            RomanNumbers romanNumbers = new RomanNumbers(input);
            romanNumbers.roman(input);
        } else {

            // for arabic numbers
            NormalNumbers normalNumbers = new NormalNumbers(input);
            normalNumbers.check(input);
        }

    }

}