// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
    Person person = new Person();

    person.setName("Victor");
    person.setAge(23);

    System.out.println("My name is " + person.getName());
    System.out.println("I'm " + person.getAge() + " years old");
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
