public class Ejercicio10 {
    public static void main(String[] args) {

        //Ejercicio 10 - Java - Edgar Vazquez
        // Conocer Valor de la constante e "e =  1/0! + 1/1! + 1/2! + 1/3! + ..."

        // Declarando Variables
        float funcionN = 1, resultado =1, e = 10;

        for (int i = 1; i <= e; i++) {
            funcionN =(1 * i) * funcionN;
            resultado = 1/funcionN + resultado;

        }
            System.out.println("La constante de e es: " + resultado);
    }
}
