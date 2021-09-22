import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        int arbolRama =0;
        Scanner ingresa = new Scanner(System.in);

        System.out.println("Ingrese el numero de ramitas");
        arbolRama = ingresa.nextInt();

        for(int i = 0; i < arbolRama; i++) {
            for( int ramita = 0; ramita <= i; ramita++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
