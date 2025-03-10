package lezione_3;

public class QuartoEsercizio {

    public static void main(String[] args) {

        int[] numeri = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < numeri.length; i++) {
            System.out.println(numeri[i]);
        }

        System.out.println("\n");

        int[] nuovoArray = new int[numeri.length + 1];
        System.arraycopy(numeri, 0, nuovoArray, 0, numeri.length);
        nuovoArray[nuovoArray.length - 1] = 60;
        numeri = nuovoArray;

        for (int num : numeri) {
            System.out.println(num);
        }

    }

}
