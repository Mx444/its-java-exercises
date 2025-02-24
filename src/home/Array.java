package home;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numeri = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        String num = Arrays.toString(numeri);
        System.out.println("Meotdo toString : " + num + "\n");

        System.out.println("Meotdo For : ");
        for (int i = 0; i < numeri.length; i++) {
            System.out.println(numeri[i]);
        }

        System.out.println("Meotdo For Somma Array: ");
        int acc = 0;
        for (int i = 0; i < numeri.length; i++) {
            acc += numeri[i];
        }
        System.out.println(acc);

    }
}
