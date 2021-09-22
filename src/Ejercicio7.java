import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Ejercicio 7 - Java - Edgar Vazquez , Numeros Primos.

        // Solicitando Numero
        Scanner num1 = new Scanner (System.in);
        System.out.println("Entre un numero para comprobar si es numero primo");
        boolean esPrimo = false;
        int numPrimo = num1.nextInt();

        for (int i = 2; i < numPrimo / 2; i++){
            if (numPrimo % i == 0){
                esPrimo = false;
                System.out.println("No es numero primo");
            }
            else {
                System.out.println("Es numero primo");
            }

        }
    }
}
