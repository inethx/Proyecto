package Quiz3;

public class Ingredientes {

    String nombre;
    int codigo;
    String descripcion;
    int precio;

    public Ingredientes(){
        
    }

    public Ingredientes(String nombre) {
        this.nombre = nombre;
    }
    
    public Ingredientes(String nombre, int codigo, String descripcion, int precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public void piña(){
        
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
