import java.util.Scanner;

public class Esercizio2 {

    public static void esercizio2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la prima stringa: ");
        String a = scanner.nextLine();
        System.out.println("Inserisci la seconda stringa: ");
        String b = scanner.nextLine();
        System.out.println("Inserisci la terza stringa: ");
        String c = scanner.nextLine();
        System.out.println("Concatenazione: " + a + b + c);

        System.out.println("Stringhe in ordine => " + a + " " + b + " " + c);
        System.out.println("Stringhe in ordine inverso => " + c + " " + b + " " + a);
    }

    public static void main(String[] args) {

        esercizio2();
    }
}

