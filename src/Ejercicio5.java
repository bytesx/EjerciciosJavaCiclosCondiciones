public class Ejercicio5 {
    public static void main(String[] args)  {
        // Ejercicio 5 - Edgar Vazquez - Piramide
        // Usare Ciclo FOR

        for (int ladrillo1 = 0; ladrillo1 < 10; ladrillo1++) {
            for (int bloque1 = 0; bloque1 < 10 - ladrillo1; bloque1++)
                System.out.print(" ");
            for (int block1 = 0; block1 < (2 * ladrillo1 + 1); block1++)
                System.out.print("*");
            System.out.println();
        }
    }
}
