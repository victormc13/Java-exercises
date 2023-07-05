// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        suma(10, 20);
        System.out.println("The factorial of your number is: " + factorial(5));
    }

    public static void suma(int a, int b) { //Recursive function (Always check the behavior of the statements)
        var temp = a + b;
        System.out.println(temp);

        if (b >= 90) { // If we don't set a condition here.... It will break the code in a loop
            return;
        }

        suma(a, temp);
    }

    public static int factorial(int number) { //Recursive function
        int result;
        if (number == 1) {
            return 1;
        }
        result = factorial(number - 1) * number;
        return result;
    }

    public static int factorialNR(int number) { //No Recursive function
        int temp;
        int result = 1;

        for (temp = 1; temp <= number; temp++) {
            result = result * temp;
        }

        return result;
    }
}
