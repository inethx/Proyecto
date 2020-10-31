
import java.util.Scanner;

public class Biciesto {

    public static boolean biciesto(int año) {
        boolean resultado = false;
        boolean cond1 = false, cond2 = false, cond3 = false;

        double residuo = año % 4;
        if (residuo == 0) {
            cond1 = true;
        }

        residuo = año % 100;
        if (residuo == 0) {
            cond2 = true;
        }

        residuo = año % 400;
        if (residuo == 0) {
            cond3 = true;
        }

        if (cond1 && (!cond2 || cond3)) {
            resultado = true;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int n;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el año que desea saber si es biciesto:");
        n = entrada.nextInt();
        
        boolean s = biciesto(n);

        if (s == true) {
            System.out.println("El año " + n + " si es un año biciesto");
        } else {
            System.out.println("El año " + n + " no es un año biciesto");
        }

    }
}

