package com.zack.javabot;

import java.util.Scanner;

public class JavaBot {
    public static void main(String[] args){
        System.out.println("Hello. What is your name?");
        Scanner userInput = new Scanner(System.in);
        String name = userInput.nextLine();
        System.out.println("Hello, " + name + "\nHow are you?");
        String mood = userInput.nextLine();
        if (mood.equalsIgnoreCase("Good")) {
            System.out.println("Glad to hear that, " + name + ".");
        } else if (mood.equalsIgnoreCase("Bad")){
            System.out.println("Sorry to hear that, " + name + ".");
        } else {
            System.out.println("Alright, " + name + ".");
        }
        //System.out.println("I can do math for you.\n would you like me to do addition, subtracion, multiplacation or division")
    }
}