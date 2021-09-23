public class Ejercicio3 {
    public static void main(String[] args) {
        // Ejercicio 3 - Java - Edgar Vazquez
        // Tabla del 9

        for(int numero = 9, x = 1; x < 11; ) {

            int resultado = numero * x;
            String mensaje = numero + " * " + resultado;

            System.out.println(mensaje);
            x++;

        }
    }
}
