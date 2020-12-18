package Proyecto2.UnirVectores;

import java.util.Scanner;

public class TesterCaso5 {

    public static void main(String[] args) {
        int numArreglo1;
        int numArreglo2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cuantos numeros desea su primer vector?:");
        numArreglo1 = entrada.nextInt();
        Vector1 crearVector1 = new Vector1(numArreglo1);
        crearVector1.generarVector();
        crearVector1.mostrarVector();

        System.out.println();

        System.out.println("¿Cuantos numeros desea su segundo vector?:");
        numArreglo2 = entrada.nextInt();
        Vector2 crearVector2 = new Vector2(numArreglo2);
        crearVector2.generarVector();
        crearVector2.mostrarVector();

        UnionVector union = new UnionVector(crearVector1.getVector(), crearVector2.getVector());
        union.unirVector();
        union.ordenarVector();
        union.mostrarVector();
    }
}
