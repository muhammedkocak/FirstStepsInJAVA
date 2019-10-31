package demo;

import java.util.Scanner;

public class MathOperator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Voeg een getal in aub.");
        int number1 = keyboard.nextInt();
        System.out.println("Voer nogmaals een getal in aub.");
        int number2 = keyboard.nextInt();

        System.out.println("De som van beide getallen = " + (number1 + number2));
        System.out.println("Het verschil van beide getallen = " + (number1 - number2));
        System.out.println("Het product van beide getallen = " + (number1 * number2));
        System.out.println("De deling van beide getallen = " + (number1 / number2));
        System.out.println("De rest van beide getallen = " + (number1 % number2));



        keyboard.close();
    }
}
