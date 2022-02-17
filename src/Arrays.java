import java.util.Random;

public class Arrays {

    public static void imprimeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transponeMatiz(int[][] matriz) {
        int[][] matrizTraspuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matrizTraspuesta[j][i] = matriz[i][j];
            }
        }
        return matrizTraspuesta;
    }

    public static void rellenaMatiz(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(3);
            }
        }
    }

    public static void main(String[] args) {
        int[][] matriz = new int[2][3];
        rellenaMatiz(matriz);
        imprimeMatriz(matriz);
        System.out.println();
        imprimeMatriz(transponeMatiz(matriz));
    }
}
