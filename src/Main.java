// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        client.name = "Victor";
        client.age = 23;
        client.phone = 931928801;
        client.credit = 1312.99;
        System.out.println("My name is " + client.name + ". I'm " + client.age + " years old " + "with phone " + client.phone + " and my currently credit is " + client.credit + "$");
    }
}

class Person {
    String name;
    int age;
    long phone;
}

class Client extends Person {
    double credit;
}
