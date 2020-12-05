package Proyecto2.TipoDeCambio;

public class TipoDecambio {

    private int dolar = 500;
    private double euro = 1.53;
    private double cantidad;

    public TipoDecambio() {

    }

    public TipoDecambio(double cantidad) {
        this.cantidad = cantidad;
    }

    public double eurosColones(double euros) {
        
        double cantidadDolares = cantidad * euro;
        double resultado = cantidadDolares*dolar;
        System.out.println("El tipo de cambio de " + cantidad + " euros a colones sería:");
        System.out.println(resultado + " colones.");
        return resultado;
    }
        
    public double eurosDolares(double euros) {
        double resultado = cantidad * euro;
        double diferenciaDolar = resultado - (int) resultado;

        System.out.println("El tipo de cambio de " + (int) cantidad + " euros a dolares sería:");
        System.out.println((int) resultado + " dolares.   " + diferenciaDolar + " dolares.");
        TipoDecambio dolarColon = new TipoDecambio(diferenciaDolar);

        dolarColon.dolaresColones(diferenciaDolar);
        return resultado;
    }

    public double dolaresEuros(int dolares) {
        double resultado = cantidad / euro;

        double acumulacionEuro = 0;
        if (cantidad >= euro) {
            for (int i = 0; i < (int) resultado; i++) {
                acumulacionEuro += euro;
            }
            double calcularDolar = cantidad - acumulacionEuro;
            System.out.println("El tipo de cambio de " + cantidad + " dolares a euros sería:");
            System.out.println((int) resultado + " euros.   " + calcularDolar + " dolares");
            TipoDecambio cambio = new TipoDecambio(calcularDolar);

            cambio.dolaresColones(calcularDolar);

            return (int) resultado;
        } else {
            System.out.println("El tipo de cambio de " + cantidad + " dolares a euros sería:");
            System.out.println(resultado + " euros.   " + cantidad + " dolares");
            return resultado;
        }

    }

    public double dolaresColones(double dolares) {
        double resultado = cantidad * dolar;
        System.out.println("El tipo de cambio de " + cantidad + " dolares a colones sería:");
        System.out.println(resultado + " colones.");
        return resultado;
    }

    public int colonesDolares(double colones) {
        int resultado = (int) cantidad / dolar;
        int cantidadColon = 0;
        if (cantidad >= dolar) {
            for (int i = 0; i < resultado; i++) {
                cantidadColon += dolar;
            }
            int cantidadColonTotal = (int) cantidad - cantidadColon;
            System.out.println("El tipo de cambio de " + cantidad + " colones a dolares sería:");
            System.out.println(resultado + " dolares.  " + cantidadColonTotal + " colones.");
            return resultado;
        } else {
            System.out.println("El tipo de cambio de " + cantidad + " colones a dolares sería:");
            System.out.println("0 euros. " + cantidad + " colones.");
            resultado = (int) cantidad;
            return resultado;
        }

    }

    public int colonesEuros(int colones) {
        double dolarEuro = dolar * euro;
        if (cantidad >= dolarEuro) {
            int resultado = (int) cantidad / (int) dolarEuro;
            int sumaDolar = 0;
            for (int i = 0; i < resultado; i++) {
                sumaDolar += dolarEuro;
            }
            int resta = colones - sumaDolar;
            System.out.println("El tipo de cambio de " + colones + " colones a euros sería:");
            System.out.println((int) resultado + " euros. " + resta + " colones.");
            return resultado;
        } else {
            System.out.println("El tipo de cambio de " + colones + " colones a euros sería:");
            System.out.println("0 euros. " + colones + " colones.");
            int resultado = colones;
            return resultado;
        }
    }

    public int getDolar() {
        return dolar;
    }

    public void setDolar(int dolar) {
        this.dolar = dolar;
    }

    public double getEuro() {
        return euro;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public double getColones() {
        return cantidad;
    }

    public void setColones(double colones) {
        this.cantidad = colones;
    }

}
