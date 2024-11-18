import java.util.Scanner;

public class Esercizio3 {

    public static double perimetroRettangolo(double lato1, double lato2) {
        return (lato1+lato2) * 2;
    }

    public static int pariDispari(int num) {
        if(num % 2 != 0) {
            return 1;
        }
        return num % 2;
    }

    public static double perimetroTriangolo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci lato 1:");
        double lato1 = scanner.nextDouble();
        System.out.println("Inserisci lato 2:");
        double lato2 = scanner.nextDouble();
        System.out.println("Inserisci lato 3:");
        double lato3 = scanner.nextDouble();

        double semiPer = (lato1 + lato2 + lato3)/2;

        return Math.sqrt(semiPer * (semiPer - lato1) * (semiPer - lato2) * (semiPer - lato3)) ;
    }

    public static void main(String[] args) {
        double n1 = 0.2;
        double n2 = 0.5;
        System.out.println("Perimetro rettangolo: " + perimetroRettangolo(n1,n2));

        int n3 = 3;
        System.out.println("Numero dispari: " + pariDispari(n3));
        int n4 = 4;
        System.out.println("Numero pari: " + pariDispari(n4));

        System.out.println("Area triangolo: " + perimetroTriangolo());

    }
}
