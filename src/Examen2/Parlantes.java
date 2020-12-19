package Examen2;

import java.util.Scanner;

public class Parlantes {

    int parlIzquierdo;
    int parlDerecho;
    int parlSubwoofer;
    String audio;
    int volumen;
    Scanner entrada = new Scanner(System.in);

    public Parlantes() {

    }

    public Parlantes(int volumen) {
        this.volumen = volumen;
    }

    public Parlantes(String audio, int volumen) {
        this.audio = audio;
        this.volumen = volumen;
    }

    public Parlantes(String audio) {
        this.audio = audio;
    }

    public int subirBajarVolumen(int vol) {

        volumen = 5;
        parlIzquierdo = volumen;
        parlDerecho = volumen;
        parlSubwoofer = volumen;
        System.out.println("Desea bajar o subir volumen:");
        System.out.println("[1] Bajar.");
        System.out.println("[2] subir.");
        int opcion = entrada.nextInt();
        if (opcion == 1) {
            System.out.println("Cual parlante desea bajar volumen:");
            System.out.println("[1] Parlante izquierdo.");
            System.out.println("[2] Parlante derecho");
            System.out.println("[3] Parlante subwoofer");
            int tipoParl = entrada.nextInt();
            if (tipoParl == 1) {
                parlIzquierdo = volumen - vol;
                return parlIzquierdo;
            } else if (tipoParl == 2) {
                parlDerecho = volumen - vol;
                return parlDerecho;
            } else {
                parlSubwoofer = volumen - vol;
                return parlSubwoofer;
            }
        } else {
            System.out.println("Cual parlante desea subir volumen:");
            System.out.println("[1] Parlante izquierdo.");
            System.out.println("[2] Parlante derecho");
            System.out.println("[3] Parlante subwoofer");
            int tipoParl = entrada.nextInt();
            if (tipoParl == 1) {
                parlIzquierdo = volumen + vol;
                return parlIzquierdo;
            } else if (tipoParl == 2) {
                parlDerecho = volumen + vol;
                return parlDerecho;
            } else {
                parlSubwoofer = volumen + vol;
                return parlSubwoofer;
            }
        }

    }

    public int getParlIzquierdo() {
        return parlIzquierdo;
    }

    public void setParlIzquierdo(int parlIzquierdo) {
        this.parlIzquierdo = parlIzquierdo;
    }

    public int getParlDerecho() {
        return parlDerecho;
    }

    public void setParlDerecho(int parlDerecho) {
        this.parlDerecho = parlDerecho;
    }

    public int getParlSubwoofer() {
        return parlSubwoofer;
    }

    public void setParlSubwoofer(int parlSubwoofer) {
        this.parlSubwoofer = parlSubwoofer;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

}
