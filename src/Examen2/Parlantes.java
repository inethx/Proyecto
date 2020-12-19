package Examen2;

import java.util.Scanner;

public class Parlantes {

    boolean parlIzquierdo = true;
    boolean parlDerecho = true;
    boolean parlSubwoofer = true;
    String[] audio;
    int volumen;
    Scanner entrada = new Scanner(System.in);

    public Parlantes() {

    }

    public boolean isParlIzquierdo() {
        return parlIzquierdo;
    }

    public void setParlIzquierdo(boolean parlIzquierdo) {
        this.parlIzquierdo = parlIzquierdo;
    }

    public boolean isParlDerecho() {
        return parlDerecho;
    }

    public void setParlDerecho(boolean parlDerecho) {
        this.parlDerecho = parlDerecho;
    }

    public boolean isParlSubwoofer() {
        return parlSubwoofer;
    }

    public void setParlSubwoofer(boolean parlSubwoofer) {
        this.parlSubwoofer = parlSubwoofer;
    }

    public String[] getAudio() {
        return audio;
    }

    public void setAudio(String[] audio) {
        this.audio = audio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public int subirBajarVolumen(int vol) {

        volumen = 5;
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
                int parlIzqVol = volumen - vol;
                return parlIzqVol;
            } else if (tipoParl == 2) {
                int parlDerVol = volumen - vol;
                return parlDerVol;
            } else {
                int parlSubVol = volumen - vol;
                return parlSubVol;
            }
        } else {
            System.out.println("Cual parlante desea subir volumen:");
            System.out.println("[1] Parlante izquierdo.");
            System.out.println("[2] Parlante derecho");
            System.out.println("[3] Parlante subwoofer");
            int tipoParl = entrada.nextInt();
            if (tipoParl == 1) {
                int parlIzqVol = volumen + vol;
                return parlIzqVol;
            } else if (tipoParl == 2) {
                int parlDerVol = volumen + vol;
                return parlDerVol;
            } else {
                int parlSubVol = volumen + vol;
                return parlSubVol;
            }
        }

    }

    public void estadoParlante() {
        System.out.println("Desea deshabilitar o habilitar:");
        System.out.println("[1] Deshabilitar.");
        System.out.println("[2] Habilitar");
        int estado = entrada.nextInt();

            switch (estado) {

                case 1:
                    System.out.println("Cual parlante desea deshabilitada:");
                    System.out.println("[1] Parlante izquierdo.");
                    System.out.println("[2] Parlante derecho");
                    System.out.println("[3] Parlante subwoofer");
                    int tipoParl = entrada.nextInt();
                    if (tipoParl == 1) {
                        parlIzquierdo = false;

                    } else if (tipoParl == 2) {
                        parlDerecho = false;

                    } else {
                        parlSubwoofer = false;

                    }
                    break;

                case 2:
                    System.out.println("Cual parlante desea habilitada:");
                    System.out.println("[1] Parlante izquierdo.");
                    System.out.println("[2] Parlante derecho");
                    System.out.println("[3] Parlante subwoofer");
                    tipoParl = entrada.nextInt();
                    if (tipoParl == 1) {
                        parlIzquierdo = true;

                    } else if (tipoParl == 2) {
                        parlDerecho = true;

                    } else {
                        parlSubwoofer = true;

                    }
            }
        }
public void sonar(){
    if(parlIzquierdo=true){
        System.out.println
    }
}
    
}

