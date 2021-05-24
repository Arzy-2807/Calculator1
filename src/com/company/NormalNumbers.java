package com.company;

public class NormalNumbers {
    private  String input = "";

    public NormalNumbers(String input){
        this.input = input;
    }

    public static void check(String input){
        if (input.contains("+")) {
            System.out.println(getFirstNumberAdd(input)+
                    getSecondNumberAdd(input));

        } else if (input.contains("-")) {
            System.out.println(getFirstNumberMinus(input)-
                    getSecondNumberMinus(input));

        } else if (input.contains("*")) {
            System.out.println(getFirstNumberMultiply(input)*
                    getSecondNumberMultiply(input));

        } else if (input.contains("/")) {
            System.out.println(getFirstNumberDivide(input)/
                    getSecondNumberDivide(input));
        }
    }

    public static int getFirstNumberAdd(String input){
        int num1 = Integer.parseInt(input.substring(0,input.indexOf('+')));
        return num1;

    }
    public static int getSecondNumberAdd(String input){
        int num2 = Integer.parseInt(input.substring(input.indexOf('+')+1));
        return num2;
    }
    public static int getFirstNumberMinus(String input){
        int num1 = Integer.parseInt(input.substring(0,input.indexOf('-')));
        return num1;

    }
    public static int getSecondNumberMinus(String input){
        int num2 = Integer.parseInt(input.substring(input.indexOf('-')+1));
        return num2;
    }
    public static int getFirstNumberMultiply(String input){
        int num1 = Integer.parseInt(input.substring(0,input.indexOf('*')));
        return num1;

    }
    public static int getSecondNumberMultiply(String input){
        int num2 = Integer.parseInt(input.substring(input.indexOf('*')+1));
        return num2;
    }
    public static int getFirstNumberDivide(String input){
        int num1 = Integer.parseInt(input.substring(0,input.indexOf('/')));
        return num1;

    }
    public static int getSecondNumberDivide(String input){
        int num2 = Integer.parseInt(input.substring(input.indexOf('/')+1));
        return num2;
    }

}