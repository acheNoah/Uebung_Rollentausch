import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
            System.out.println("Lukas stinkt");

            // Korrigiere Scanner-Initialisierung
            Scanner scanner = new Scanner(System.in);

            System.out.println("Bitte gib etwas ein");
            String name = scanner.nextLine();  // Korrigiere Aufruf von nextLine()

            System.out.println("Hast du schon etwas eingegeben?");
            boolean wahrheit = scanner.nextBoolean();  // Korrigiere Datentyp und Aufruf

            // Korrigiere if-Bedingung
            if (wahrheit) {
                System.out.println("Ok cool");
            } else {
                System.out.println("nicht cool");
            }
        }
    }
}
