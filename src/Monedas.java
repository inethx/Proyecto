
import java.util.Scanner;

public class Monedas {

    public static int monedas(int num) {

        int monedas[] = {1000, 500, 100, 10, 5, 1};
        int cantidad[] = {0, 0, 0, 0, 0, 0};
        cantidad[0] = num;

        for (int i = 0; i < 1; i++) {

            while (cantidad[i] > 0 && cantidad[i] != num - 1) {
                cantidad[i] = num / monedas[i];
                int res = num - (monedas[i] * cantidad[i]);
                for (int j = 0; j < 6; j++) {
                    if (j > i) {
                        cantidad[j] = res / monedas[j];
                        res -= monedas[j] * cantidad[j];
                    }
                    System.out.println(cantidad[j] + " moneda/s de " + monedas[j]);
                }
                break;
            }
            int total = 0;
            for (int conteo = 0; conteo < cantidad.length; conteo++) {
                total += cantidad[conteo];
            }
            System.out.println("El total de monedas es " + total);
        }
        return num;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Ingresa un Numero entero:");
        num = entrada.nextInt();
        System.out.println();
        System.out.println("La cantida " + num + " se distribuye en monedas:");
        monedas(num);
    }

}
