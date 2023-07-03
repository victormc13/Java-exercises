// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        client.name = "Victor";
        client.age = 23;
        client.phone = 931928801;
        client.credit = 1312.99;
        System.out.print("My name is " + client.name + ". I'm " + client.age + " years old " + "with phone " + client.phone
                + " and my available credit is " + client.credit + "$");
        System.out.println(" Is hired?: " + client.hired());

        Employee employee = new Employee();
        employee.name = "Alfred";
        employee.age = 26;
        employee.phone = 5053822;
        employee.salary = 20000;
        System.out.print("My name is " + employee.name + ". I'm " + employee.age + " years old " + "with phone " + employee.phone
                + " and my current salary is " + employee.salary + "$");
        System.out.println(" Is hired?: " + employee.hired());
    }
}

class Person {
    String name;
    int age;
    long phone;
}


class Client extends Person {
    double credit;

    
    public boolean hired() {
        return false;
    }
}

class Employee extends Person {
    double salary;


    public boolean hired() {
        return true;
    }
}