package Examen2;

import java.util.Scanner;

public class Parlantes {

    boolean parlIzquierdo;
    boolean parlDerecho;
    boolean parlSubwoofer;
    String audio;
    int parIzqVolumen;
    int parDerVolumen;
    int parSubVolumen;
    int volumen;
    Scanner entrada = new Scanner(System.in);

    public Parlantes() {

    }

    public Parlantes(String audio, int parIzqVolumen, int parDerVolumen, int parSubVolumen, int volumen) {
        this.audio = audio;
        this.parIzqVolumen = parIzqVolumen;
        this.parDerVolumen = parDerVolumen;
        this.parSubVolumen = parSubVolumen;
        this.volumen = volumen;
    }

    public void subirBajarVolumen() {

        int volumenDefault = 5;
        parIzqVolumen = volumenDefault;
        parDerVolumen = volumenDefault;
        parSubVolumen = volumenDefault;
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
                System.out.println("Cuanto desea bajar");
                volumen = entrada.nextInt();
                parIzqVolumen = volumenDefault - volumen;

            } else if (tipoParl == 2) {
                System.out.println("Cuanto desea bajar");
                volumen = entrada.nextInt();
                parDerVolumen = volumenDefault - volumen;

            } else {
                System.out.println("Cuanto desea bajar");
                volumen = entrada.nextInt();
                parSubVolumen = volumenDefault - volumen;

            }
        } else {
            System.out.println("Cual parlante desea subir volumen:");
            System.out.println("[1] Parlante izquierdo.");
            System.out.println("[2] Parlante derecho");
            System.out.println("[3] Parlante subwoofer");
            int tipoParl = entrada.nextInt();
            if (tipoParl == 1) {
                System.out.println("Estado del volumen parlante izquierdo " + parIzqVolumen);
                System.out.println("Cuanto desea subir");
                volumen = entrada.nextInt();

                parIzqVolumen = volumenDefault + volumen;

            } else if (tipoParl == 2) {
                System.out.println("Estado del volumen parlante derecho " + parDerVolumen);
                System.out.println("Cuanto desea subir");
                volumen = entrada.nextInt();
                parDerVolumen = volumenDefault + volumen;

            } else {
                System.out.println("Estado del volumen parlante subwoofer " + parSubVolumen);
                System.out.println("Cuanto desea subir");
                volumen = entrada.nextInt();
                parSubVolumen = volumenDefault + volumen;

            }
        }
    }

    public void estadoParlante() {
        System.out.println("Desea deshabilitar o habilitar:");
        System.out.println("[1] Deshabilitar.");
        System.out.println("[2] Habilitar");
        int estado = entrada.nextInt();
        parlIzquierdo = true;
        parlDerecho = true;
        parlSubwoofer = true;
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

    public void sonar() {

        if (parlIzquierdo = true) {
            System.out.println("Parlante izquiedo. Estado: habilitado.");
            System.out.println("Parlante izquiedo. Volumen: " + parIzqVolumen);
            audio = "1010110";
            System.out.println(audio);

        } else {
            System.out.println("Parlante izquiedo. Estado: deshabilitado.");
        }

        if (parlDerecho = true) {
            System.out.println("Parlante derecho. Estado: habilitado.");
            System.out.println("Parlante derecho. Volumen: " + parDerVolumen);
            audio = "1010110";
            System.out.println(audio);
        } else {
            System.out.println("Parlante derecho. Estado: deshabilitado.");
        }

        if (parlSubwoofer = true) {
            System.out.println("Parlante subwoofer. Estado: habilitado.");
            System.out.println("Parlante subwoofer. Volumen: " + parSubVolumen);

        } else {
            System.out.println("Parlante subwoofer. Estado: deshabilitado.");
        }
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

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

}
