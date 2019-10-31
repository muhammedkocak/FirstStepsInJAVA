package demo;

import java.util.Random;
import java.util.Scanner;

public class HigherLower {
    public static void main(String[] args) {
        //Declaration and initialisation
        var keyboard = new Scanner(System.in);
        var rand = new Random();
        var numberToGuess = rand.nextInt(100);

        //print out  " enter a number"
        System.out.println("Enter a number:");
        var guessed = false;
        //loop or "herhaling"
        //as long as guessed is false is repeats a block of code below
        while (!guessed) {
            // keyboard.nextInt()
            var guess = keyboard.nextInt();
            if (guess < numberToGuess) {
                System.out.println("Higher!!!");
            } else if (guess > numberToGuess) {
                System.out.println("Lower!!!");
            } else {
                System.out.println("!!!Guessed!!!");
                guessed = true;
            }
        }

    keyboard.close();
}
}
