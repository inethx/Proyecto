
import java.util.Scanner;


public class CalculadoraPromedioConArreglos {

    public static int promedio(int[] numeros) {
        int resultado = 0;

        int suma = 0;
        for (int i=0;i<numeros.length;i++) {
            suma+=numeros[i];
        }
        resultado = suma / numeros.length;
        return resultado;
    }    
    
    public static void main(String[] args){
        int numero;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Favor digite la cantidad de numeros: ");
        numero = entrada.nextInt();
        
        int[] pi = new int[numero];
       

        for (int i = 0; i < numero; i++) {
            System.out.println("Favor digite numero " + (i + 1) + ": ");
            pi[i] = entrada.nextInt();
        }
        int resultado = promedio(pi);
        System.out.println("El promedio es: " + resultado);
    }    
}
