package demo;

import java.util.Scanner;

public class KeyboardUtility {

    public static int readInt() {
        Scanner keyboard = new Scanner(System.in);
        int scannedNumber = keyboard.nextInt();
        return scannedNumber;
    }
}
