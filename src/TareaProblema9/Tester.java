package TareaProblema9;

import java.util.Scanner;

public class Tester {

    public static void main(String args[]) {

        SistemaNotas sistema = new SistemaNotas();
        Scanner entrada = new Scanner(System.in);
        boolean agregar = true;
        while (agregar) {

            System.out.println("Digite el nombre del alumno:");
            String nombAlumno = entrada.next();
            System.out.println("Digite el apellido del alumno:");
            String apellAlumno = entrada.next();
            System.out.println("Digite el carne:");
            int numCarnet = entrada.nextInt();
            
            Alumno alum = new Alumno(nombAlumno, apellAlumno, numCarnet);

            System.out.println("Digite el nombre del padre:");
            String nombPadre = entrada.next();
            System.out.println("Digite el apellido del padre:");
            String apellPadre = entrada.next();
            System.out.println("Digite la edad del padre:");
            int padreEdad = entrada.nextInt();
            System.out.println("Digite el nombre de la madre:");
            String nombMadre = entrada.next();
            System.out.println("Digite el apellido de la madre:");
            String apellMadre = entrada.next();
            System.out.println("Digite la edad de la madre:");
            int madreEdad = entrada.nextInt();

            PadreFamiliar familiar = new PadreFamiliar(nombPadre, apellPadre, padreEdad, nombMadre, apellMadre, madreEdad);
            
            System.out.println("Digite puntos totales:");
            int puntosTotales = entrada.nextInt();
            System.out.println("Digite puntos obtenidos:");
            int puntosObtenidos = entrada.nextInt();

            int nota = (puntosObtenidos * 100) / puntosTotales;

            Examen e = new Examen(familiar, alum, nota, puntosTotales,
                    puntosObtenidos, null);

            sistema.agregarEx(e);

            sistema.mostrarExamenes();
            System.out.println("¿Desea agregar otro examen? ¿si/no?");
            String salida = entrada.next();
            if (salida.equals("no")) {
                agregar = false;
            }
        }

    }
}
