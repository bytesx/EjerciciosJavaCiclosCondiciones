import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        //Ejercicio 9 - Java - Edgar Vazquez
        // Obterner el factorial de un numero entero

        //Solicitando numero
        Scanner numDado = new Scanner(System.in);
        System.out.println("Entre un numero entero para calcular su factorial");

        //Declarando Variables
        int num1 = numDado.nextInt();
        int resFactorial = 0;


        for (int numEntero = num1, x = 1; x < num1; x++) {
            resFactorial = numEntero *= x;

        }
        // Resultado
        System.out.println(resFactorial);

    }
}
