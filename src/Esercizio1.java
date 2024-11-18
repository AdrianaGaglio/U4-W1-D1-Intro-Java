public class Esercizio1 {

    public  static int moltiplica(int a, int b) {
        return a + b;
    }

    public  static String concatena(String a, int b) {
        return a + " " + b;
    }

    public static  String[] inserisciInArray(String[] args, String a) {
        String[] arr = new String[6];

        for (int i = 0; i < 2; i++) {
            arr[i] = args[i];
        }

        // Inserisce la nuova stringa al terzo posto
        arr[2] = a;

        for (int i = 3; i < 6; i++) {
            arr[i] = args[i-1];
        }

        return arr;
    }

    public static void main(String[] args) {

        int n1 = 2;
        int n2 = 3;
        System.out.println("Risultato moltiplicazione: " + Esercizio1.moltiplica(n1, n2));

        String s = "Hello";
        int num = 5;
        System.out.println("Risultato concatenazione " + Esercizio1.concatena(s, num));

        String[] stringhe = {"Uno", "Due", "Tre", "Quattro", "Cinque"};
        String string = "Ciao";
        System.out.println("Risultato array: ");

        String[] array = inserisciInArray(stringhe, string);
        int length = inserisciInArray(stringhe, string).length;
        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }
    }
}
