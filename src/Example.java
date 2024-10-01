import java.util.Scanner;

public class Example {
    static Scanner scanner = new Scanner(System.in);
    static FindAbsoluteValue findAbsoluteValue = new FindAbsoluteValue();

    public static void main(String[] args) throws Exception {
        System.out.print("Please enter a number you want to find the absolute value of: ");
        double value = scanner.nextDouble();
        double absoluteValue = findAbsoluteValue.findValue(value);
        System.out.println("|" + value + "| = " + absoluteValue);
        System.out.println("The absolute value of " + value + " is " + absoluteValue);
    }
}
