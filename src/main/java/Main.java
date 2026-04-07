import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Select Calculator(A,B,C): ");
        String calculator = scanner.nextLine();



        if (calculator.equalsIgnoreCase("a")){
            System.out.println("welcome to the mortgage calculator");

            System.out.print("What is your principle amount: ");
            double princible = scanner.nextDouble();

            System.out.print("What is your annual interest rate: ");
            double annualInterestRate = scanner.nextDouble();

            System.out.print("How many years is your loan: ");
            int loanLength = scanner.nextInt();

            double monthlyInterest = (annualInterestRate/100) / 12;
            int totalMonths = loanLength * 12;


            double monthlyPayments = princible * (monthlyInterest * Math.pow(1 + monthlyInterest,totalMonths)) / (Math.pow(1 + monthlyInterest,totalMonths) - 1);
            double totalInterest = princible - (monthlyPayments * loanLength);

            System.out.println("Here are your monthly payments: $ " + monthlyPayments);
            System.out.println("Here is your total interest: $ " + totalInterest );
        }
        scanner.close();
    }
}
