import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Escribe  un arxivo con su extension");
        String arxivo = reader.next();
        String nombre = "";
        String extension = "";

        for (int i = 0; i < arxivo.length() - 1; i++) {
            if (arxivo.charAt(i) != '.') {
                nombre += arxivo.charAt(i);
            } else break;

        }
        for (int i = nombre.length() + 1; i < arxivo.length(); i++) {
            extension = extension + arxivo.charAt(i);
        }

        System.out.println(extension + '.' + nombre);

    }
}
