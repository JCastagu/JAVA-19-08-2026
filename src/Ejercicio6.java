public class Ejercicio6 {

    public static class Estudiante {
        private double nota;

        public Estudiante(double nota) {
            this.nota = nota;
        }

        public void mostrarBoletin() {
            System.out.println("Mi nota es: " + this.nota);
        }

        public static double compararNotas(double n1, double n2) {
            return Math.max(n1, n2);
        }
    }

    public static void main(String[] args){
        Estudiante ana = new Estudiante(8.5);
        Estudiante luis = new Estudiante(6.0);

        ana.mostrarBoletin();
        luis.mostrarBoletin();

        System.out.println("La mejor nota es: " + Estudiante.compararNotas(8.5, 6.0));
    }
}