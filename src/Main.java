// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Victor");
        person.setAge(23);
        person.setPhone(931928801);

        System.out.println("My name is " + person.getName());
        System.out.println("I'm " + person.getAge() + " years old");
        System.out.println("My phone is " + person.getPhone());
    }
}

class Person {
    private String name;
    private int age;
    private long phone;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public long getPhone() {
        return phone;
    }
}
