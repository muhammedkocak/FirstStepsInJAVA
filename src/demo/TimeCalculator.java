package demo;
import java.util.*;

public class TimeCalculator {
        public static void main(String[] args){
            Scanner keyboard = new Scanner(System.in);

            System.out.println("Geef het aantal minuten: ");
            int input = keyboard.nextInt();
            int min = input;
            int dag = (min / 60)/24;

            int uur = (min / 60)%24;

            min = min%60;




            System.out.println(dag + "dagen, " + uur + "uren, " + min + "minuten.");

            keyboard.close();
        }

    }

