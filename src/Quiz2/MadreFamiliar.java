
package Quiz2;

public class MadreFamiliar {
    String nombreMadre;
    String apellidoMadre;
    int edadMadre;
    Alumno alumno;

    public MadreFamiliar(String nombreMadre, String apellidoMadre, int edadMadre) {
        this.nombreMadre = nombreMadre;
        this.apellidoMadre = apellidoMadre;
        this.edadMadre = edadMadre;
    }

    public MadreFamiliar(String nombreMadre, String apellidoMadre, int edadMadre, Alumno alumno) {
        this.nombreMadre = nombreMadre;
        this.apellidoMadre = apellidoMadre;
        this.edadMadre = edadMadre;
        this.alumno = alumno;
    }

        public void mostrarInformacion() {
        System.out.println("Nombre del padre: " + nombreMadre + " " + apellidoMadre);
        System.out.println("Edad del padre: " + edadMadre);
        System.out.println();
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

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    
}
