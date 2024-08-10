import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


         int[] arreglo;
        int nElementos;
        int aux;

        System.out.println("Ingrese la cantidad del arreglo");
        nElementos = scanner.nextInt();

        arreglo = new int[nElementos];

        for (int i = 0; i < nElementos; i++) {
            System.out.println("ingrese los numeros a ordenar");
            arreglo[i] = scanner.nextInt();
        }

        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }

        System.out.println("error");
        for (int ints : arreglo) {
            System.out.print(ints + " ");
        }
/*    matriz IJ con diagonal principal =1 y el resto es cero
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

*/

        
    }
}
