

import java.util.Scanner;

public class Examen1b {

    public static void Datospersonales(String nombre, String apellido1, String apellido2, int edad, String sexo) {

        System.out.println("Nombre del paciente: " + nombre + " " + apellido1 + " " + apellido2);
        System.out.println("Edad del paciente:   " + edad);
        System.out.println("Sexo del paciente:   " + sexo);

    }

    public static void Datospersonales(String fumado, String covid, int edad, String sangre) {

        System.out.println("Tipo de sangre:      " + sangre);
        System.out.println("Paciente tiene COVID-19: " + covid);
        boolean histFumado = false;
        if (fumado.equals("si")) {
            histFumado = true;
            System.out.println("Paciente presenta un historial de fumado o enfermedad grave");
        } else {
            System.out.println("Paciente no presenta un historial de fumado o enfermedad grave");
        }

        if (histFumado == true || edad > 50 || sangre.equals("o-")) {
            System.out.println("El paciente tiene un riesgo");
        } else {
            System.out.println("El paciente no tiene ningun riesgo");
        }

    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Bienvenido al sistema del Ministerio de Salud.");
        System.out.println("¿Desea iniciar?. Escoja una opcion.");

        System.out.println("[1] si");
        System.out.println("[2] no");
        int inicio = entrada.nextInt();
        int i = inicio;
        while (i == 1) {

            System.out.println("¿Desea agregar datos personales o datos medicos? Escoje una opcion:");
            System.out.println("[1] Datos personales.");
            System.out.println("[2] Datos medicos.");
            int datosp = entrada.nextInt();
            int j = datosp;
            while (j == 2) {
                System.out.println("Usuario no tiene datos personales");
                System.out.println("Por favor ingrese datos personales:");
                System.out.println("[1] Datos personales.");
                System.out.println("[2] Datos medicos.");
                datosp = entrada.nextInt();
                j = datosp;
            }
            System.out.println("Nombre del paciente:");
            String nombre = entrada.next();
            System.out.println("Primer apellido del paciente:");
            String apellido1 = entrada.next();
            System.out.println("Segundo apellido del paciente:");
            String apellido2 = entrada.next();
            System.out.println("Edad del paciente:");
            int edad = entrada.nextInt();
            System.out.println("Sexo del paciente: ¿Hombre/Mujer?");
            String sexo = entrada.next();

            System.out.println("Historial de fumado o alguna enfermedad grave: ¿Si/No?");
            String fumado = entrada.next();
            System.out.println("Tipo de sangre del paciente");
            String sangre = entrada.next();
            System.out.println("El paciente tiene COVID-19: ¿Si/No?");
            String covid = entrada.next();

            Datospersonales(nombre, apellido1, apellido2, edad, sexo);
            Datospersonales(fumado, covid, edad, sangre);
            System.out.println();
            System.out.println("¿Desea obtener la probabilida de que el paciente no enferme en forma grave?: ¿si/no?");
            String probabilidad = entrada.next();
            if (probabilidad.equals("si")) {
                double porcentaje = 0.1 * edad;
                System.out.println("Su probabilidad de riesgo es: " + porcentaje);
            }
            System.out.println("¿Desea borrar todos los datos?: ¿si/no?");
            String datos = entrada.next();
            if (datos.equals("si")) {
                nombre = null;
                apellido1 = null;
                apellido2 = null;
                edad = 0;
                sexo = null;
                fumado = null;
                sangre = null;
                covid = null;

            }
            System.out.println("Desea usar el sistema nuevamente?:");
            System.out.println("[1] si");
            System.out.println("[2] no");
            inicio = entrada.nextInt();
            i = inicio;
        }
    }
}
