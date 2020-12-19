package Examen2;

import java.util.Scanner;

public class EquipoSonido {

    String[] listaAudio = new String[1000];
    Parlantes parlante;
    Scanner entrada = new Scanner(System.in);
    int conteo = 0;

    public EquipoSonido() {

    }

    public EquipoSonido(Parlantes parlante) {
        this.parlante = parlante;
    }

    public void lista() {
        for (int i = 0; i < listaAudio.length; i++) {
            listaAudio[i] = "";
        }
    }

    public void inicializacionLista() {
        System.out.println("Desea iniciar la lista:");
        System.out.println("[1] Aleatoria.:");
        System.out.println("[2] Desde un punto.:");
        int iniciar = entrada.nextInt();
        if (iniciar == 1) {
            for (int i = 0; i < listaAudio.length; i++) {
                int aleatorio = (int) (Math.random() * listaAudio.length);
                if (listaAudio.equals("") == false) {
                    System.out.println(listaAudio[i]);
                }

            }
        } else {
            System.out.println("Desde cual punto:");
            int iniciarPunto = entrada.nextInt();
            for (int i = iniciarPunto; i < listaAudio.length; i++) {
                if (listaAudio.equals("") == false) {
                    System.out.println(listaAudio[i]);
                }
            }
        }
    }

    public boolean agregarCancion(String audio) {
        boolean resultado = false;
        if (conteo < listaAudio.length) {
            listaAudio[conteo] = audio;
            conteo++;
            resultado = true;
        }
        return resultado;
    }

    public boolean eliminarCancion() {
        boolean resultado = false;
        if (conteo != 0) {
            listaAudio[conteo - 1] = null;
            conteo--;
            resultado = true;
        }
        return resultado;
    }

    public String[] getListaAudio() {
        return listaAudio;
    }

    public void setListaAudio(String[] listaAudio) {
        this.listaAudio = listaAudio;
    }

    public Parlantes getParlante() {
        return parlante;
    }

    public void setParlante(Parlantes parlante) {
        this.parlante = parlante;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public int getConteo() {
        return conteo;
    }

    public void setConteo(int cont) {
        this.conteo = conteo;
    }

}
