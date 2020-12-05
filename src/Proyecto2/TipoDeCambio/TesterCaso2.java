
package Proyecto2.TipoDeCambio;

import java.util.Scanner;

public class TesterCaso2 {
    
   public void sistema() {
        Scanner entrada = new Scanner(System.in);
        TipoDecambio tipo = new TipoDecambio();
        System.out.println("Bienvenidos al tipo de cambio del banco.");
        System.out.println("Dolares: " + tipo.getDolar() + " colones    Euros: " + tipo.getEuro() + " dolares");
        System.out.println("¿Desea hacer un tipo de cambio?");
        System.out.println("[1] Si.");
        System.out.println("[2] No.");
        int pregunta = entrada.nextInt();

        if (pregunta == 1) {
            boolean i = true;
            while (i) {

                System.out.println("¿Que tipo de cambio desea?");
                System.out.println("[1] Colones a dolares.");
                System.out.println("[2] Colones a euros.");
                System.out.println("[3] Dolares a colones.");
                System.out.println("[4] Dolares a euros.");
                System.out.println("[5] Euros a dolares.");
                System.out.println("[6] Euros a colones.");

                int tipoDeCambio = entrada.nextInt();

                switch (tipoDeCambio) {
                    case 1:

                        System.out.println("Digite la cantidad de colones");
                        int colones = entrada.nextInt();
                        TipoDecambio cambio = new TipoDecambio(colones);
                        cambio.colonesDolares(colones);
                        System.out.println("¿Desea hacer otro tipo de cambio?");
                        System.out.println("[1] Si.");
                        System.out.println("[2] No.");
                        pregunta = entrada.nextInt();
                        if (pregunta == 2) {
                            i = false;
                        }
                        break;
                    case 2:
                        System.out.println("Digite la cantidad de colones");
                        colones = entrada.nextInt();
                        cambio = new TipoDecambio(colones);
                        cambio.colonesEuros(colones);
                        System.out.println("¿Desea hacer otro tipo de cambio?");
                        System.out.println("[1] Si.");
                        System.out.println("[2] No.");
                        pregunta = entrada.nextInt();
                        if (pregunta == 2) {
                            i = false;
                        }
                        break;
                    case 3:
                        System.out.println("Digite la cantidad de dolares");
                        int dolares = entrada.nextInt();
                        cambio = new TipoDecambio(dolares);
                        cambio.dolaresColones(dolares);
                        System.out.println("¿Desea hacer otro tipo de cambio?");
                        System.out.println("[1] Si.");
                        System.out.println("[2] No.");
                        pregunta = entrada.nextInt();
                        if (pregunta == 2) {
                            i = false;
                        }
                        break;
                    case 4:
                        System.out.println("Digite la cantidad de dolares");
                        dolares = entrada.nextInt();
                        cambio = new TipoDecambio(dolares);
                        cambio.dolaresEuros(dolares);
                        System.out.println("¿Desea hacer otro tipo de cambio?");
                        System.out.println("[1] Si.");
                        System.out.println("[2] No.");
                        pregunta = entrada.nextInt();
                        if (pregunta == 2) {
                            i = false;
                        }
                        break;                        
                  case 5:
                        System.out.println("Digite la cantidad de euros");
                        double euros = entrada.nextInt();
                        cambio = new TipoDecambio(euros);
                        cambio.eurosDolares(euros);
                        System.out.println("¿Desea hacer otro tipo de cambio?");
                        System.out.println("[1] Si.");
                        System.out.println("[2] No.");
                        pregunta = entrada.nextInt();
                        if (pregunta == 2) {
                            i = false;
                        }
                        break;                            
                  case 6:
                        System.out.println("Digite la cantidad de euros");
                        euros = entrada.nextInt();
                        cambio = new TipoDecambio(euros);
                        cambio.eurosColones(euros);
                        System.out.println("¿Desea hacer otro tipo de cambio?");
                        System.out.println("[1] Si.");
                        System.out.println("[2] No.");
                        pregunta = entrada.nextInt();
                        if (pregunta == 2) {
                            i = false;
                        }
                        break;        
                }
            }

        }
            System.out.println("Gracias por usar el tipo de cambio del banco");
            System.out.println("Que tenga un buen día");
    }
    public static void main(String[] args) {
       TesterCaso2 problema=new TesterCaso2();
        problema.sistema();
    }
}
    


