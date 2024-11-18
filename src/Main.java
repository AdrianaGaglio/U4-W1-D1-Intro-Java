import java.sql.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        System.out.println("--- Esercizio 1 ---");
        System.out.println("Risultato moltiplicazione: " + Esercizio1.moltiplica(2, 3));
        System.out.println("Risultato concatenazione " + Esercizio1.concatena("Hello ", 5));
        String[] stringhe = {"Uno", "Due", "Tre", "Quattro", "Cinque"};
        System.out.println("Risultato array: ");
        String[] array = Esercizio1.inserisciInArray(stringhe, "Ciao");
        for (int i = 0; i < Esercizio1.inserisciInArray(stringhe, "Ciao").length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("---------------");
        System.out.println();

        System.out.println("--- Esercizio 2 ---");
        Esercizio2.main();
        System.out.println("---------------");
        System.out.println();

        System.out.println("--- Esercizio 3 ---");
        System.out.println("Perimetro rettangolo: " + Esercizio3.perimetroRettangolo(0.2,0.5));
        System.out.println("Numero dispari: " + Esercizio3.pariDispari(3));
        System.out.println("Numero pari: " + Esercizio3.pariDispari(4));
        System.out.println("Area triangolo: " + Esercizio3.perimetroTriangolo());
        System.out.println("---------------");
        System.out.println();
        
    }

}