public class Ejercicio7 {
    public static void main(String[] args) {
        double[] calificaciones = {7.5, 8.0, 6.5, 9.0, 5.5};

        System.out.println("Promedio de la clase: " + calcularPromedioClase(calificaciones));
    }

    public static double calcularPromedioClase(double[] calificaciones){
        double suma = 0;
        for (double nota : calificaciones) {
            suma += nota;
        }
        return suma / calificaciones.length;
    }
}