import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] matriz = new int[6][6];


        //creacion de la matriz con diagonal principal 1
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }

            }
        }

        //recorriendo la matraiz de arriba
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }


    }
}