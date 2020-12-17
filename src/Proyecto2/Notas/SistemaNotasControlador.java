package Proyecto2.Notas;

public class SistemaNotasControlador {

    SistemaNotasInterfaz interfaz;

    public SistemaNotasControlador() {

    }
public void enviarDatos(){
     interfaz = new SistemaNotasInterfaz();
     interfaz.interfaz();
} 
    public SistemaNotasInterfaz getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(SistemaNotasInterfaz interfaz) {
        this.interfaz = interfaz;
    }

}
