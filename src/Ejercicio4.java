public class Ejercicio4 {
    public static void main(String[] args){
        System.out.println("4 es par: " + esPar(4));
        System.out.println("7 es par: " + esPar(7));
    }
    public static boolean esPar(int numero){
        return numero % 2 == 0;
    }
}