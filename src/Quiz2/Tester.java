package Quiz2;

import java.util.Scanner;

public class Tester {

    public static void main(String args[]) {

        SistemaNotas sistema = new SistemaNotas();
        Scanner entrada = new Scanner(System.in);
        boolean agregar = true;

        while (agregar) {
            System.out.println("Escoja una opcion:");
            System.out.println("[1] Agregar Examen.");
            System.out.println("[2] Eliminar Examen");
            System.out.println("[3] Mostrar Examen");
            int pregunta = entrada.nextInt();
            Alumno alum;
            PadreFamiliar padreFamiliar;
            MadreFamiliar madreFamiliar;
            switch (pregunta) {
                case 1:
                    System.out.println("Digite el nombre del alumno:");
                    String nombAlumno = entrada.next();
                    System.out.println("Digite el apellido del alumno:");
                    String apellAlumno = entrada.next();
                    System.out.println("Digite el carne:");
                    int numCarnet = entrada.nextInt();

                    alum = new Alumno(nombAlumno, apellAlumno, numCarnet);

                    System.out.println("Digite el nombre del padre:");
                    String nombPadre = entrada.next();
                    System.out.println("Digite el apellido del padre:");
                    String apellPadre = entrada.next();
                    System.out.println("Digite la edad del padre:");
                    int padreEdad = entrada.nextInt();

                    padreFamiliar = new PadreFamiliar(nombPadre, apellPadre, padreEdad);

                    System.out.println("Digite el nombre de la madre:");
                    String nombMadre = entrada.next();
                    System.out.println("Digite el apellido de la madre:");
                    String apellMadre = entrada.next();
                    System.out.println("Digite la edad de la madre:");
                    int madreEdad = entrada.nextInt();

                    madreFamiliar = new MadreFamiliar(nombMadre, apellMadre, madreEdad);

                    System.out.println("Digite puntos totales:");
                    int puntosTotales = entrada.nextInt();
                    System.out.println("Digite puntos obtenidos:");
                    int puntosObtenidos = entrada.nextInt();

                    int nota = (puntosObtenidos * 100) / puntosTotales;

                    Examen e = new Examen(padreFamiliar, madreFamiliar, alum, nota, puntosTotales,
                            puntosObtenidos, null);

                    sistema.agregarEx(e);
                    sistema.mostrarExamenes();

                    System.out.println("¿Desea salir del sistema? ¿si/no?");
                    String salida = entrada.next();
                    if (salida.equals("si")) {
                        agregar = false;
                    }
                    break;
                case 2:
                    if (sistema.cont == 0) {
                        System.out.println("El sistema no tiene datos de algun examen");
                    System.out.println("¿Desea salir del sistema? ¿si/no?");
                    salida = entrada.next();
                    if (salida.equals("si")) {
                        agregar = false;                        
                    }
                    }else{
                    System.out.println("Se elimino el examen");
                    sistema.eliminarEx();

                    System.out.println("¿Desea salir del sistema? ¿si/no?");
                    salida = entrada.next();
                    if (salida.equals("si")) {
                        agregar = false;
                    }
                    }
                    break;

                case 3:
                    if (sistema.cont == 0) {
                        System.out.println("El sistema no tiene datos de algun examen");
                        System.out.println("¿Desea salir del sistema? ¿si/no?");
                        salida = entrada.next();
                        if (salida.equals("si")) {
                            agregar = false;
                        }
                    } else {
                        sistema.mostrarExamenes();
                        System.out.println("¿Desea salir del sistema? ¿si/no?");
                        salida = entrada.next();
                        if (salida.equals("si")) {
                            agregar = false;
                        }
                    }
                    break;
                default:
                    System.out.println("Opcion invalida");
                    System.out.println("¿Desea salir del sistema? ¿si/no?");
                    salida = entrada.next();
                    if (salida.equals("si")) {
                        agregar = false;
                    }
                    break;
            }

        }

    }
}
