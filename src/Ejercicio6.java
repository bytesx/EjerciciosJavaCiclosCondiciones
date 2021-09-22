public class Ejercicio6 {
    public static void main(String[] args) {
        // Ejercio6 - Edgar Vazquez
        int fib, num1 = 0, num2 = 1, num3, count = 11;

        for(fib=2; fib < count; ++fib) {
            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}