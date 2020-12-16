package Proyecto2.UnirVectores;

import java.util.Scanner;

public class Vector1 {

    private int[] vector;
    private int numArreglo;
    private Scanner entrada = new Scanner(System.in);

    public Vector1() {

    }

    public Vector1(int numArreglo) {
        this.numArreglo = numArreglo;
    }

    public void generarVector() {

        boolean ciclo = true;

        while (ciclo) {
            System.out.println("¿Que funcion desea?:");
            System.out.println("[1] Crear vector automaticamente:");
            System.out.println("[2] Crear vector manuelamente:");
            int pregunta = entrada.nextInt();
            vector = new int[numArreglo];
            switch (pregunta) {
                case 1:
                    for (int i = 0; i < vector.length; i++) {
                        vector[i] = (int) (Math.random() * 99);
                    }
                    ciclo = false;
                    break;

                case 2:
                    for (int i = 0; i < vector.length; i++) {
                        System.out.println("Agregue vector " + (i + 1));
                        vector[i] = entrada.nextInt();
                    }
                    ciclo = false;
                    break;

                default:
                    System.out.println("Funcion no valida.");
                    ciclo = true;
                    break;
            }
        }

    }

    public void mostrarVector() {
        System.out.println("El vector sería:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println();
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public int getNumArreglo() {
        return numArreglo;
    }

    public void setNumArreglo(int numArreglo) {
        this.numArreglo = numArreglo;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

}
