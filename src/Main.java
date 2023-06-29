// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.agregarPuertas();
        System.out.println(miCoche.puertas);
    }
}

class Coche {
    public int puertas = 4;

    public void agregarPuertas() {
        this.puertas++;
    }
}
