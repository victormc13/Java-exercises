// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        //if, else-if, else statements
        int numeroIf = 13;

        if (numeroIf > 0) {
            System.out.println("La variable numeroIf " + numeroIf + " es positivo");
        } else if (numeroIf < 0) {
            System.out.println("La variable numeroIf " + numeroIf + " es negativo");
        } else {
            System.out.println("La variable numeroIf es 0");
        }


        //While statement
        int numeroWhile = 1;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("Ahora el valor de la variable numeroWhile es: " + numeroWhile);
        }
    }
}