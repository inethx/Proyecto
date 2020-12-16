package Proyecto2.BusquedaBinario;

import java.util.Arrays;

public class SistemaBinario {

    int numVector;
    int vector[];
    int numEntero;

    public SistemaBinario() {

    }

    public SistemaBinario(int numVector) {
        this.numVector = numVector;
    }

    public SistemaBinario(int numVector, int numEntero) {
        this.numVector = numVector;
        this.numEntero = numEntero;
    }

    public void iniciarArreglo() {
        vector = new int[numVector];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(vector);

    }

    public void mostrarArreglo() {
        System.out.println("El vector seria:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println();
    }

    public int busquedaBinario(int[] vector, int entero  ) {

        int inicio = 0;
        int fin = vector.length - 1;
        int pos;
        while (inicio <= fin) {
            pos = (inicio + fin) / 2;
            if (vector[pos] == numEntero) {
            return pos;
            } else if (vector[pos] < numEntero) {
                inicio = pos + 1;
            } else {
                fin = pos - 1;
            }
        }
        return -1;
    }



    public int getNumVector() {
        return numVector;
    }

    public void setNumVector(int numVector) {
        this.numVector = numVector;
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public int getNumEntero() {
        return numEntero;
    }

    public void setNumEntero(int numEntero) {
        this.numEntero = numEntero;
    }

}
