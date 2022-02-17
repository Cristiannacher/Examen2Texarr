import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Escribe una palabra");
        String palabra = reader.next();
        String palabraCodificada = "";

        for(int i = 0; i< palabra.length() ; i++){
            if("AaEeIiOoUu".contains(""+palabra.charAt(i))) {
                switch (palabra.charAt(i)) {
                    case 'A':
                        palabraCodificada += "@";
                        break;
                    case 'a':
                        palabraCodificada += "@";
                        break;
                    case 'E':
                        palabraCodificada += "3";
                        break;
                    case 'e':
                        palabraCodificada += "3";
                        break;
                    case 'I':
                        palabraCodificada += "1";
                        break;
                    case 'i':
                        palabraCodificada += "1";
                        break;
                    case 'O':
                        palabraCodificada += "0";
                        break;
                    case 'o':
                        palabraCodificada += "0";
                        break;
                    case 'U':
                        palabraCodificada += "*";
                        break;
                    case 'u':
                        palabraCodificada += "*";
                        break;
                }
            }else palabraCodificada += palabra.charAt(i);
        }
        System.out.println("La palabra normal es " + palabra);
        System.out.println("La palabra codifacada es " + palabraCodificada);

    }
}
