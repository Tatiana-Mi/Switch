package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if(value==1) {
            System.out.println("Value was 1");
        }else if(value ==2) {
            System.out.println("Value was 2");
        }else{
            System.out.println("Was not 1 or 2");
        }
        int switchValue = 3;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }
        char charValue = 'h';
        switch(charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue + " was found");
                break;

            default:
                System.out.println("Could not find A, B, C, D");
                break;
        }
        String month ="JuNE";
        switch(month.toLowerCase()) {
           // or switch(month) { } case "january": case "jAnuary": case "jaNuary":   any possible combinations upper/lower Case


            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }

    }
}
