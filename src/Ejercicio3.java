import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Escribe una frase");
        String frase = reader.nextLine();
        int cuentaPalabras = 0;

        for(int i = 0; i<frase.length() -1; i++){
            if(i == 0) {
                if ("aouei".contains("" + frase.charAt(i)))
                    cuentaPalabras++;
            }
            if (frase.charAt(i) == ' '){
                if ("aouei".contains("" + frase.charAt(i+1)))
                    cuentaPalabras++;
            }
        }

        System.out.println("Esta frase tiene "+ cuentaPalabras+ " que empiezan por vocal");
    }
}
