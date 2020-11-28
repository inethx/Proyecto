package TareaProblema9;

public class PadreFamiliar {

    String nombrePadre;
    String apellidoPadre;
    int edadPadre;
    String nombreMadre;
    String apellidoMadre;
    int edadMadre;
    Alumno alumno;

    public PadreFamiliar(){
        
    }

    public PadreFamiliar(String nombrePadre, String apellidoPadre, int edadPadre, String nombreMadre, String apellidoMadre, int edadMadre) {
        this.nombrePadre = nombrePadre;
        this.apellidoPadre = apellidoPadre;
        this.edadPadre = edadPadre;
        this.nombreMadre = nombreMadre;
        this.apellidoMadre = apellidoMadre;
        this.edadMadre = edadMadre;
    }

    public PadreFamiliar(String nombrePadre, String apellidoPadre, int edadPadre) {
        this.nombrePadre = nombrePadre;
        this.apellidoPadre = apellidoPadre;
        this.edadPadre = edadPadre;
    }
    
    
    public PadreFamiliar(String nombrePadre, String apellidoPadre, int edadPadre, String nombreMadre, String apellidoMadre, int edadMadre, Alumno alumno) {
        this.nombrePadre = nombrePadre;
        this.apellidoPadre = apellidoPadre;
        this.edadPadre = edadPadre;
        this.nombreMadre = nombreMadre;
        this.apellidoMadre = apellidoMadre;
        this.edadMadre = edadMadre;
        this.alumno = alumno;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del padre: " + nombrePadre + " " + apellidoPadre);
        System.out.println("Edad del padre: " + edadPadre);
        System.out.println();
        System.out.println("Nombre del madre: " + nombreMadre + " " + apellidoMadre);
        System.out.println("Edad del madre: " + edadMadre);
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }

    public String getApellidoMadre() {
        return apellidoMadre;
    }

    public void setApellidoMadre(String apellidoMadre) {
        this.apellidoMadre = apellidoMadre;
    }

    public int getEdadMadre() {
        return edadMadre;
    }

    public void setEdadMadre(int edadMadre) {
        this.edadMadre = edadMadre;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrepadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getApellidoPadre() {
        return apellidoPadre;
    }

    public void setApellidoPadre(String apellidoPadre) {
        this.apellidoPadre = apellidoPadre;
    }

    public int getEdadPadre() {
        return edadPadre;
    }

    public void setEdadPadre(int edadPadre) {
        this.edadPadre = edadPadre;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

}
