public class EjercicioExamen {
    public static void main(String[] args) throws Exception {
        Examen e1 = new Examen("Tema 1", 6.7);
        System.out.println(e1);
        System.out.println(e1.redondear());

        if (e1.EstaAprobado() == false){
            System.out.println("Estas suspenso");
        }else System.out.println("estas aprobado");
    }
}
