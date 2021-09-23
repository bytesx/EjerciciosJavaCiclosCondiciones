import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        // Ejercicio 2 - Java - Edgar Vazquez - Orden ascendente de numeros


        // Declarando Variables
        int num1, num2, num3;

        // Solicitando 3 numeros enteros
        Scanner ingresa1 = new Scanner(System.in);
        System.out.println("Entre un numero");
        num1 = ingresa1.nextInt();


        Scanner ingresa2 = new Scanner(System.in);
        System.out.println("Entre otro numero");
        num2 = ingresa2.nextInt();

        Scanner ingresa3 = new Scanner(System.in);
        System.out.println("Entre el tercer numero");
        num3 = ingresa3.nextInt();

        // Recap de numeros entrados
        System.out.println("Los numeros entrados son " + num1 + " " + num2 +  " " + num3);

        // Funcion IF para Ordenar numeros
        if (num1 <= num2 && num1 <= num3 || num2 <= num3 ) {
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        }
        else if (num2 <= num1 && num2 <= num3 || num1 <= num3) {
            System.out.println(num2);
            System.out.println(num1);
            System.out.println(num3);
        }
        else if (num3 <= num1 && num3 <= num2 || num1 <= num2) {
            System.out.println(num3);
            System.out.println(num2);
            System.out.println(num1);
        }
    }
}
