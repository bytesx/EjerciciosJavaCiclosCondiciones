public class Ejercicio8 {
        public static void main(String[] args) {
            // Ejercicio 8 - Java - Edgar Vazquez , Multiplicar 2 *2 hasta 4570

            // Declarando Variables
            int num1 = 2, num2 = 2, resultado = 0, resultado2;

            for (resultado = 0; resultado < 4570;) {
                resultado = num1 * num2;
                if (resultado < 4570) {
                   resultado2 = resultado * num1;
                    System.out.println(resultado);
                }
            }

        }
}
