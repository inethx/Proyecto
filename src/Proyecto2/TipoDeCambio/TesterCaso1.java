package Proyecto2.TipoDeCambio;



public class TesterCaso1 {

    public void sistema() {

        TipoDecambio tipo = new TipoDecambio();
        System.out.println("Bienvenidos al tipo de cambio del banco.");
        System.out.println("Dolares: " + tipo.getDolar() + " colones    Euros: " + tipo.getEuro() + " dolares");
        System.out.println();
        
        int colones = 2000;
        TipoDecambio cambio = new TipoDecambio(colones);
        cambio.colonesDolares(colones);
        cambio.colonesEuros(colones);

        int dolares = 4;
        cambio = new TipoDecambio(dolares);
        cambio.dolaresColones(dolares);
        cambio.dolaresEuros(dolares);

        double euros = 2;
        cambio = new TipoDecambio(euros);
        cambio.eurosDolares(euros);
        cambio.eurosColones(euros);

        System.out.println();
        System.out.println("Gracias por usar el tipo de cambio del banco");
        System.out.println("Que tenga un buen día");
    }

    public static void main(String[] args) {
        TesterCaso1 problema = new TesterCaso1();
        problema.sistema();
    }
}
