import java.util.Scanner;

public class Calculator {
    public static void main (String []args) {
        // show the user the possibilities
        String operationWanted = "";
        int number1 = 0;
        int number2 = 0;

        System.out.println("Hi, please enter the number corresponding to the operation you want to do");
        System.out.println("1- Add");
        System.out.println("2- Substract");
        System.out.println("3- Mutiply");
        System.out.println("4- Devide");

        Scanner inputOperation = new Scanner(System.in);
        operationWanted = inputOperation.nextLine();

        Scanner inputNumbers = new Scanner(System.in);

        System.out.println("Please enter the 1st number");
        number1 = inputNumbers.nextInt();

        System.out.println("Please enter the 2nd number");
        number2 = inputNumbers.nextInt();

        int result = number1 + number2;
        System.out.println(result);

    }

    // method for adding


    // method for substracting


    // method for multiplying


    // method for deviding


}
