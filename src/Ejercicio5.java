public class Ejercicio5 {
    public static void main(String[] args){
        System.out.println("Promedio de dos notas: " + calcularPromedio(6.5, 8.0));

        double[] notas = {5.5, 7.0, 8.5, 9.0};
        System.out.println("Promedio del arreglo: " + calcularPromedio(notas));
    }

    public static double calcularPromedio(double nota1, double nota2){
        return (nota1 + nota2) / 2;
    }

    public static double calcularPromedio(double[] notas){
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }
}