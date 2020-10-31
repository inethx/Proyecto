import java.util.Scanner;
        
public class CalculadoraPromedio {
    
    public static void main(String[] args){

        Scanner entrada=new Scanner(System.in);
        int a;
        int b;
        int c=0;
        
        System.out.println("¿Cuantos digitos desea hacer su promedio?");
        a=entrada.nextInt();
        
        for(int i=1;i<=a;i++){
            System.out.println("Digite la cantidad");
            b=entrada.nextInt();
            c += b;
        }
        double a1=Double.valueOf(a);
        double c1=Double.valueOf(c);
        double resultado=c1/a1;
        System.out.println();
       
        System.out.println("Su promedio es "+resultado);
        
    }
}
