package demo;

import java.util.Scanner;

public class ChoiceApp {

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);

        System.out.println("Enter your age please");
        var age = keyboard.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult");
        }
        else if (age >= 10) {
                System.out.println("You are a teenager");
        }
        else if (age >= 2) {
                System.out.println("You are a child");
        }
            else {
                System.out.println("You are a baby");
            }



    keyboard.close();

    }
}
