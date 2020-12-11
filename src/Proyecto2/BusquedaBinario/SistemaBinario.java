package Proyecto2.BusquedaBinario;

import java.util.Arrays;

public class SistemaBinario {

    int numVector;
    int vector[];
    int numBinario;
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

    public void busquedaBinario() {

        numBinario = vector.length / 2;

        if (vector[numBinario - 1] == numEntero) {
            System.out.println("El numero si esta en el vector");
        } else if (vector[numBinario - 1] < numEntero) {
            numBinario = numBinario / 2;
        }else{
            
        }
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

    public int getNumBinario() {
        return numBinario;
    }

    public void setNumBinario(int numBinario) {
        this.numBinario = numBinario;
    }

    public int getNumEntero() {
        return numEntero;
    }

    public void setNumEntero(int numEntero) {
        this.numEntero = numEntero;
    }

}
