public class Ejercicio8 {
        public static void main(String[] args) {
            // Ejercicio 8 - Java - Edgar Vazquez , Multiplicar 2 * hasta 4570


            int resultado = 0;
            for (int multiplicador = 2, x = 2; x <= 4568 && resultado <= 4568; x++) {
                resultado = x * multiplicador;
                System.out.println(resultado);
            }

        }
}
