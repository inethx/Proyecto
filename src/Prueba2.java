
import java.util.Scanner;

public class Prueba2 {

    public static int factorial(int a){
        int resultado=0;
        int fact=1;
        
        while(a!=0){
            fact=fact*a;
            a--;
        }
        resultado=fact;
        return resultado;
    }
    public static void main(String[] args){
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite el numero que desea:");
        int numero=entrada.nextInt();
        System.out.println("Su numero "+numero+ " su factorial es "+factorial(numero));
    }
}