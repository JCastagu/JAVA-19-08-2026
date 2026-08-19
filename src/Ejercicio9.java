public class Ejercicio9 {

    public static String clasificarNota(double nota){
        if (nota < 6.0) {
            return "Reprobado";
        } else if (nota <= 8.0) {
            return "Aprobado";
        } else {
            return "Excelente";
        }
    }

    public static void main(String[] args){
        System.out.println("4.5 -> " + clasificarNota(4.5));
        System.out.println("7.2 -> " + clasificarNota(7.2));
        System.out.println("9.8 -> " + clasificarNota(9.8));
    }
}