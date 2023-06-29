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


        //Do-While statement
        int numeroDoWhile = 3;
        //Al no cumplir con la condición entra una sola vez al bucle
        do {
            numeroDoWhile++;
            System.out.println("Ahora el valor de la variable numeroDoWhile es: " + numeroDoWhile);
        } while (numeroDoWhile < 3);


        //for statement
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El valor de la variable numeroFor es: " + numeroFor);
        }


        //Switch statement
        String estacion = "otoño";

        switch (estacion) {
            case "verano":
                System.out.println("Estamos en la estacion de: " + estacion);
                break;
            case "otoño":
                System.out.println("Estamo en la estacion de: " + estacion);
                break;
            case "invierno":
                System.out.println("Estamo en la estacion de: " + estacion);
                break;
            case "primavera":
                System.out.println("Estamo en la estacion de: " + estacion);
                break;
            default:
                System.out.println("No es una estacion");
        }
    }
}