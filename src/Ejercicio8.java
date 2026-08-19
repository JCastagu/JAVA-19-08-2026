import java.util.Arrays;

public class Ejercicio8 {

    public static int[] generarTablaMultiplicar(int numero){
        int[] tabla = new int[10];
        for (int i = 0; i < 10; i++) {
            tabla[i] = numero * (i + 1);
        }
        return tabla;
    }

    public static void main(String[] args){
        int[] tabla = generarTablaMultiplicar(7);
        System.out.println("Tabla del 7: " + Arrays.toString(tabla));
    }
}