
package Quiz3;


public class TiposPizza {
    Ingredientes ingredientes1;
    Ingredientes ingredientes2;
    Ingredientes ingredientes3;
    Ingredientes ingredientes4;
    public TiposPizza(){
        
    }
    public TiposPizza(Ingredientes ingredientes1, Ingredientes ingredientes2, Ingredientes ingredientes3, Ingredientes ingredientes4) {
        this.ingredientes1 = ingredientes1;
        this.ingredientes2 = ingredientes2;
        this.ingredientes3 = ingredientes3;
        this.ingredientes4 = ingredientes4;
    }

    
    public Ingredientes getIngredientes1() {
        return ingredientes1;
    }

    public void setIngredientes1(Ingredientes ingredientes1) {
        this.ingredientes1 = ingredientes1;
    }

    public Ingredientes getIngredientes2() {
        return ingredientes2;
    }

    public void setIngredientes2(Ingredientes ingredientes2) {
        this.ingredientes2 = ingredientes2;
    }

    public Ingredientes getIngredientes3() {
        return ingredientes3;
    }

    public void setIngredientes3(Ingredientes ingredientes3) {
        this.ingredientes3 = ingredientes3;
    }

    public Ingredientes getIngredientes4() {
        return ingredientes4;
    }

    public void setIngredientes4(Ingredientes ingredientes4) {
        this.ingredientes4 = ingredientes4;
    }

    
}
