package Examen2;

import java.util.Scanner;

public class Controlador {

    Scanner entrada = new Scanner(System.in);
    Parlantes parlante;
    EquipoSonido equipoSonido;

    public void inicio() {
        equipoSonido = new EquipoSonido();
        parlante = new Parlantes();
        boolean i = true;
        while (i) {
            System.out.println("Escoja una opcion:");
            System.out.println("[1] Agregar cancion.");
            System.out.println("[2] Eliminar cancion.");
            System.out.println("[3] reproducir");
            System.out.println("[4] Salir");

            int opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    String audio = "10101001";
                    equipoSonido.agregarCancion(audio);
                    break;
                case 2:
                    equipoSonido.eliminarCancion();
                    break;
                case 3:
                    equipoSonido.inicializacionLista();
                    parlante.subirBajarVolumen();
                    parlante.estadoParlante();
                    break;
                case 4:
                    i = false;
                default:
                    System.out.println("Opcion no valida");
                    break;

            }
        }
    }
}
