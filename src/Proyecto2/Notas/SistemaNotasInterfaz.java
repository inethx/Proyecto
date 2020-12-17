package Proyecto2.Notas;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class SistemaNotasInterfaz {

    SistemaNotas sistema = new SistemaNotas();
    Scanner entrada = new Scanner(System.in);
    boolean agregar = true;
    SistemaNotasReport reporte;

    public void interfaz() {

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

                    String nombAlumno = JOptionPane.showInputDialog("Digite el nombre del alumno:");
                    String apellAlumno = JOptionPane.showInputDialog("Digite el apellido del alumno:");
                    int numCarnet = Integer.parseInt(JOptionPane.showInputDialog("Digite el carne:"));

                    alum = new Alumno(nombAlumno, apellAlumno, numCarnet);

                    String nombPadre = JOptionPane.showInputDialog("Digite el nombre del padre:");
                    String apellPadre = JOptionPane.showInputDialog("Digite el apellido del padre:");
                    int padreEdad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del padre:"));

                    padreFamiliar = new PadreFamiliar(nombPadre, apellPadre, padreEdad);

                    String nombMadre = JOptionPane.showInputDialog("Digite el nombre del madre:");
                    String apellMadre = JOptionPane.showInputDialog("Digite el apellido del madre:");
                    int madreEdad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del madre:"));

                    madreFamiliar = new MadreFamiliar(nombMadre, apellMadre, madreEdad);

                    System.out.println("Digite puntos totales:");
                    int puntosTotales = entrada.nextInt();
                    System.out.println("Digite puntos obtenidos:");
                    int puntosObtenidos = entrada.nextInt();

                    reporte = new SistemaNotasReport(puntosTotales, puntosObtenidos, alum, padreFamiliar, madreFamiliar);
                    Examen datosPersonales = new Examen(padreFamiliar, madreFamiliar, alum, reporte.getNota(), puntosTotales,
                            puntosObtenidos, null);

                    sistema.agregarEx(datosPersonales);

                    System.out.println("¿Desea salir del sistema? ¿si/no?");
                    String salida = entrada.next();
                    if (salida.equals("si")) {
                        agregar = false;
                    }
                    break;
                case 2:
                    if (sistema.cont == 0) {
                        System.out.println("El sistema no tiene datos de algun examen");
                        JOptionPane.showMessageDialog(null, "El sistema no tiene datos de algun examen");
                        System.out.println("¿Desea salir del sistema? ¿si/no?");
                        salida = entrada.next();
                        if (salida.equals("si")) {
                            agregar = false;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Se elimino el examen");
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
                        JOptionPane.showMessageDialog(null, "El sistema no tiene datos de algun examen");
                        System.out.println("¿Desea salir del sistema? ¿si/no?");
                        salida = entrada.next();
                        if (salida.equals("si")) {
                            agregar = false;
                        }
                    } else {
                        sistema.mostrarExamenes();

                        reporte.ReporteTodosExamenes();
                        boolean estado = reporte.generarReporteAlumnosConNotaInferiorA(reporte.getNota());
                        if (estado = true) {
                            System.out.println("El estudiante aprobo el examen");
                        } else {
                            System.out.println("El estudiante no aprobo el examen");
                        }
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

    public SistemaNotas getSistema() {
        return sistema;
    }

    public void setSistema(SistemaNotas sistema) {
        this.sistema = sistema;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public boolean isAgregar() {
        return agregar;
    }

    public void setAgregar(boolean agregar) {
        this.agregar = agregar;
    }

}
