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
}
