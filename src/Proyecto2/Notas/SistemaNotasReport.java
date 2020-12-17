package Proyecto2.Notas;

public class SistemaNotasReport {

    int totalPuntos;
    int puntosObtenidos;
    int nota;
    Alumno alumno;
    PadreFamiliar padre;
    MadreFamiliar madre;

    public SistemaNotasReport() {

    }

    public SistemaNotasReport(int totalPuntos, int puntosObtenidos, Alumno alumno, PadreFamiliar padre, MadreFamiliar madre) {
        this.totalPuntos = totalPuntos;
        this.puntosObtenidos = puntosObtenidos;
        this.alumno = alumno;
        this.padre = padre;
        this.madre = madre;
    }

    public void ReporteTodosExamenes() {
        nota = (puntosObtenidos * 100) / totalPuntos;

    }

    public void generarReporteTodosAlumnos() {
        alumno.mostrardatos();
        padre.mostrarInformacion();
        madre.mostrarInformacion();
    }

    public boolean generarReporteAlumnosConNotaInferiorA(int nota) {
        boolean aprobado = false;
        if (nota >= 75) {
            aprobado = true;
            return aprobado;
        } else {
            aprobado = false;
            return aprobado;
        }
    }

    public int getTotalPuntos() {
        return totalPuntos;
    }

    public void setTotalPuntos(int totalPuntos) {
        this.totalPuntos = totalPuntos;
    }

    public int getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObtenidos(int puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public PadreFamiliar getPadre() {
        return padre;
    }

    public void setPadre(PadreFamiliar padre) {
        this.padre = padre;
    }

    public MadreFamiliar getMadre() {
        return madre;
    }

    public void setMadre(MadreFamiliar madre) {
        this.madre = madre;
    }

}
