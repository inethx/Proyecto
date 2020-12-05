package Quiz2;

public class PadreFamiliar {

    String nombrePadre;
    String apellidoPadre;
    int edadPadre;
    Alumno alumno;

    public PadreFamiliar() {

    }

    public PadreFamiliar(String nombrePadre, String apellidoPadre, int edadPadre) {
        this.nombrePadre = nombrePadre;
        this.apellidoPadre = apellidoPadre;
        this.edadPadre = edadPadre;

    }

    public PadreFamiliar(String nombrePadre, String apellidoPadre, int edadPadre, Alumno alumno) {
        this.nombrePadre = nombrePadre;
        this.apellidoPadre = apellidoPadre;
        this.edadPadre = edadPadre;
        this.alumno = alumno;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del padre: " + nombrePadre + " " + apellidoPadre);
        System.out.println("Edad del padre: " + edadPadre);
        System.out.println();
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
