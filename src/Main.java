public class Main {

    public static void main(String[]args){
        Alumno kaleb = new Alumno();

        double[] calificaciones = {90,80,84,87,90};
        kaleb.setNombre(" Kaleb");
        kaleb.setCalificaciones(calificaciones);

        kaleb.imprimirResultados();
    }
}
