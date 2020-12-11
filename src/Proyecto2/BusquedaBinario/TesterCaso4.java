package Proyecto2.BusquedaBinario;

import java.util.Scanner;

public class TesterCaso4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuantos espacios desea su vector?");
        int numVector = entrada.nextInt();
        System.out.println("¿Cual numero entero desea buscar?");
        int numEntero = entrada.nextInt();

        SistemaBinario sistema = new SistemaBinario(numVector, numEntero);

        sistema.iniciarArreglo();
        sistema.mostrarArreglo();
        

        
        sistema.busquedaBinario();
    }
}
