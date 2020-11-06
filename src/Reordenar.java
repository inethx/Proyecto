
import java.util.Arrays;
import java.util.Scanner;

public class Reordenar {

    public static void Reordenar(int[] arreglo) {

 
        for (int i = (arreglo.length - 1); 0 <= i; i--) {
           
            System.out.println(arreglo[i]);
     
        }
        
    }

    public static void main(String[] args) {
        System.out.println("¿Cuantos digitos desea invertir?");
        Scanner entrada = new Scanner(System.in);
        int base = entrada.nextInt();
        int[] arreglo = new int[base];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("digite el numero " + (i + 1));
            arreglo[i] = entrada.nextInt();
        }
        System.out.println("De los numeros que digito " + Arrays.toString(arreglo) + " el resultado es la siguiente:");
        Reordenar(arreglo);

    }
}
