
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        int a;
        int b;
        int resultado;
        Scanner entrada = new Scanner(System.in);
        String operador;
        
        System.out.println("Escriba su primer digito:");
        a = entrada.nextInt();
        
        System.out.println("Escriba el tipo de operador que desea usar:");
        operador = entrada.next();
       
        System.out.println("Escriba su segundo digito:");        
        b = entrada.nextInt();

        if (operador.equals("+")) {
            resultado = a + b;
            System.out.println("EL resultado de la suma es "+ resultado);
        } else if (operador.equals("-")) {
            resultado = a - b;
            System.out.println("EL resultado de la resta es "+ resultado);
        } else if (operador.equals("*")) {
            resultado = a * b;
            System.out.println("EL resultado de la multiplicacion es "+ resultado);
        } else if (operador.equals("/") && a > b) {
            resultado = a / b;
            System.out.println("EL resultado de la division es "+ resultado);
        } else if (operador.equals("/") && a < b) {
            double a1 = Double.valueOf(a);
            double b1 = Double.valueOf(b);
            double resultado2;
            resultado2 = a1 / b1;
            System.out.println("EL resultado de la division es "+ resultado2);
        }

    }
}
