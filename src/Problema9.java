
import java.util.ArrayList;
import java.util.Scanner;


public class Problema9 {
   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuantos estudiantes desea agregar al sistema?");
        int valGlobal = entrada.nextInt();
        ArrayList notas = new ArrayList();
        ArrayList carnet = new ArrayList();

        for (int i = 0; i < valGlobal; ++i) {
            System.out.println("Ingrese el carnet del estudiante " + (i + 1) + ":");
            int valorCarnet = entrada.nextInt();
            if (carnet.contains(valorCarnet)) {
                System.out.println();
                System.out.println("El numero de carnet ya existe dentro del sistema");
                System.out.println();
                i--;
            } else {
                carnet.add(valorCarnet);
                System.out.println();
                System.out.println("Ingrese la nota del estudiante con carnet " + carnet.get(i) + ":");
                int valorNotas = entrada.nextInt();
                notas.add(valorNotas);
                System.out.println();
            }
        }
        System.out.println();
        for (int i = 0; i < valGlobal; i++) {
            System.out.println("Registro: " + (i + 1) + " Carnet: " + carnet.get(i) + " Nota: " + notas.get(i));
        }

        int j = 0;
        while (j == 0) {

            System.out.println();
            System.out.println("    Seleccione una funcion del sistema:");
            System.out.println();
            System.out.println("[1] Agregar nuevos datos.");
            System.out.println("[2] Eliminar datos existentes.");
            System.out.println("[3] Mostrar registros existentes.");
            System.out.println("[4] Salir del sistema.");
            int funcion = entrada.nextInt();

            switch (funcion) {
                case 1:
                    System.out.println();
                    System.out.println("¿Cuantos nuevos estudiantes desea agregar?");
                    int valor = entrada.nextInt();

                    for (int i = valGlobal; i < valGlobal + valor; i++) {
                        System.out.println("Ingrese el carnet del estudiante " + (i + 1) + ":");
                        int valorCarnet = entrada.nextInt();
                        if (carnet.contains(valorCarnet)) {
                            System.out.println("El numero de carnet ya existe dentro del sistema");
                            i--;
                        } else {
                            carnet.add(valorCarnet);
                            System.out.println("Ingrese la nota del estudiante con carnet " + carnet.get(i) + ":");
                            int valorNotas = entrada.nextInt();
                            notas.add(valorNotas);
                        }
                    }
                    valGlobal = valGlobal + valor;
                    System.out.println();
                    for (int i = 0; i < valGlobal; i++) {
                        System.out.println("Registro: " + (i + 1) + " Carnet: " + carnet.get(i) + " Nota: " + notas.get(i));
                    }
                    break;

                case 2:
                    System.out.println();
                    if (carnet.isEmpty()) {
                        System.out.println("No hay registros existentes.");
                    } else {
                        System.out.println("Estos son los registros existentes:");
                        System.out.println("");
                        for (int i = 0; i < valGlobal; i++) {
                            System.out.println("Registro: " + (i + 1) + " Carnet: " + carnet.get(i) + " Nota: " + notas.get(i));
                        }
                        System.out.println();
                        System.out.println("¿Ingrese el numero del registro que desea eliminar?");
                        valor = entrada.nextInt();
                        System.out.println();
                        carnet.remove(valor - 1);
                        notas.remove(valor - 1);
                        valGlobal = valGlobal - 1;
                        for (int i = 0; i < valGlobal; i++) {
                            System.out.println("Registro: " + (i + 1) + " Carnet: " + carnet.get(i) + " Nota: " + notas.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println();
                    if (carnet.isEmpty()) {
                        System.out.println("No hay registros existentes");
                    } else {
                        for (int i = 0; i < valGlobal; i++) {
                            System.out.println("Registro: " + (i + 1) + " Carnet: " + carnet.get(i) + " Nota: " + notas.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Espero que el sistema te haya ayudado.");
                    System.out.println("Que tenga un buen día.");
                    j++;
            }
        }

    }    
}
