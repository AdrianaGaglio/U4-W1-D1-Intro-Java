public class Esercizio1 {

    public  static int moltiplica(int a, int b) {
        return a + b;
    }

    public  static String concatena(String a, int b) {
        return a + b;
    }

    public static  String[] inserisciInArray(String[] args, String a) {
        String[] arr = new String[6];

        for (int i = 0; i < 2; i++) {
            arr[i] = args[i];
        }

        // Inserisce la nuova stringa al terzo posto
        arr[2] = a;

        // Sposta il quarto e quinto elemento in quinta e sesta posizione
        arr[3] = args[2];
        arr[4] = args[3];
        arr[5] = args[4];

        return arr;
    }
}
