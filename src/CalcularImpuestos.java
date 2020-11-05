
import java.util.Scanner;

public class CalcularImpuestos {

    public static double calcularImpuestos(int dependiente, double salario) {

        double porcentaje;
        double IR = 0;
        double resultado;

        switch (dependiente) {
            case 1:
                porcentaje = salario;
                if (salario < 200000) {
                    IR = salario;
                } else if (200000 <= salario && salario < 400000) {
                    IR = porcentaje * 0.10;
                } else if (400000 <= salario && salario < 600000) {
                    IR = porcentaje * 0.15;
                } else if (600000 <= salario && salario < 800000) {
                    IR = porcentaje * 0.20;
                } else if (salario >= 800000) {
                    IR = porcentaje * 0.30;
                }
                resultado = IR;
                System.out.println(resultado);
                break;
            case 2:
                porcentaje = salario * 0.90;
                if (salario < 200000) {
                    IR = salario;
                } else if (200000 <= salario && salario < 400000) {
                    IR = porcentaje * 0.10;
                } else if (400000 <= salario && salario < 600000) {
                    IR = porcentaje * 0.15;
                } else if (600000 <= salario && salario < 800000) {
                    IR = porcentaje * 0.20;
                } else if (salario >= 800000) {
                    IR = porcentaje * 0.30;
                }
                resultado = IR;
                System.out.println(resultado);
                break;
            case 3:
                porcentaje = salario * 0.70;
                if (salario < 200000) {
                    IR = salario;
                } else if (200000 <= salario && salario < 400000) {
                    IR = porcentaje * 0.10;
                } else if (400000 <= salario && salario < 600000) {
                    IR = porcentaje * 0.15;
                } else if (600000 <= salario && salario < 800000) {
                    IR = porcentaje * 0.20;
                } else if (salario >= 800000) {
                    IR = porcentaje * 0.30;
                }
                resultado = IR;
                System.out.println(resultado);
                break;
            case 4:
                porcentaje = salario * 0.60;
                if (salario < 200000) {
                    IR = salario;
                } else if (200000 <= salario && salario < 400000) {
                    IR = porcentaje * 0.10;
                } else if (400000 <= salario && salario < 600000) {
                    IR = porcentaje * 0.15;
                } else if (600000 <= salario && salario < 800000) {
                    IR = porcentaje * 0.20;
                } else if (salario >= 800000) {
                    IR = porcentaje * 0.30;
                }
                resultado = IR;
                System.out.println(resultado);
                break;
            default:
                porcentaje = salario * 0.40;
                if (salario < 200000) {
                    IR = salario;
                } else if (200000 <= salario && salario < 400000) {
                    IR = porcentaje * 0.10;
                } else if (400000 <= salario && salario < 600000) {
                    IR = porcentaje * 0.15;
                } else if (600000 <= salario && salario < 800000) {
                    IR = porcentaje * 0.20;
                } else if (salario >= 800000) {
                    IR = porcentaje * 0.30;
                }
                resultado = IR;
                System.out.println(resultado);
                break;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dependiente;
        double salario;

        System.out.println("¡Bienvenido al sistema de impuestos sobre la renta!");
        System.out.println();

        System.out.println("Por favor ingrese cuantas personas son:");
        dependiente = entrada.nextInt();
        System.out.println();

        System.out.println("¿Cuanto es su salario mensual?:");
        salario = entrada.nextDouble();
        System.out.println();

        System.out.println("Su pago de los impuestos sobre la renta es:");
        calcularImpuestos(dependiente, salario);
    }
}
