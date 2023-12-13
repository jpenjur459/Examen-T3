
public class Examen{

    private String titulo;
    private double calificacion;

    public Examen(String titulo, double calificacion) {
        this.titulo = titulo;
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getCalificacion() throws Exception {
        if (calificacion <= 10 || calificacion >= 0) {
            return calificacion;
        }else {
            throw new Exception("la nota no es valida");
        }
    }

    public void setCalificacion(double calificacion){
        this.calificacion = calificacion;

    }
    public double redondear() throws Exception {
        return Math.round(getCalificacion());
    }
    public boolean EstaAprobado(){
        if (calificacion > 5){
            return true;
        }else return false;
    }

    @Override
    public String toString() {
        return   titulo + " - " + calificacion ;
    }
}