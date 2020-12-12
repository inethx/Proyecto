package Quiz3;

public class Tester {

    public static void main(String[] args) {
        Ingredientes ingredientes1 = new Ingredientes("piña", 101010, "Piña fresca", 600);
        Ingredientes ingredientes2 = new Ingredientes("hongo", 101011, "hongo fresco", 700);
        Ingredientes ingredientes3 = new Ingredientes("jamon", 101012, "jamon fresca", 800);

        TiposPizza cliente1 = new TiposPizza();
        cliente1.setIngredientes1(ingredientes1);
        cliente1.setIngredientes2(ingredientes2);
        cliente1.setIngredientes3(ingredientes3);
        
    }
}
