// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
    Person me = new Person();

    me.setName("Victor");

    System.out.println("My name is:  " + me.getName());
    }
}

class Person {
    private String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
