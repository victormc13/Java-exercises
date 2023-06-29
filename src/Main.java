// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche();

        miCoche.agregarPuerta();

        System.out.println("Cantidad de puertas de mi coche: " + miCoche.cantidadDePuertas);
    }
}

class Coche {
    public int cantidadDePuertas = 4;

    public void agregarPuerta() {
        this.cantidadDePuertas++;
    }
}
