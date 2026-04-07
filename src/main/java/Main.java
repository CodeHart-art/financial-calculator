import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Select Calculator(A,B,C): ");
        String calculator = scanner.nextLine();

        if (calculator.equalsIgnoreCase("a"))
            System.out.println("it works");



        scanner.close();
    }
}
