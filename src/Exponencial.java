
import java.util.Scanner;

public class Exponencial {

    public static int exponencial(int base, int exponente) {

        int resultado = 1;

        for (int i = 1; i <= exponente; i++) {

            resultado = resultado * base;
        }
        System.out.println(resultado);
        return resultado;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int base;
        int exponente;

        System.out.println("Digite el numero de la base:");
        base = entrada.nextInt();
        System.out.println("Digite el exponente:");
        exponente = entrada.nextInt();

        System.out.println("Su numero " + base + " elevado a " + exponente + " el resultado es:");

        exponencial(base, exponente);
    }
}
