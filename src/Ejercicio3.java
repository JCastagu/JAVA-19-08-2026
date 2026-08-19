public class Ejercicio3 {
    public static void main(String[] args){
        double area = calcularAreaRectangulo(3.1, 4);
        System.out.println("El area del rectangulo es " + area);

    }
    public static double calcularAreaRectangulo(double base, double altura){
        return base * altura;
    }
}
