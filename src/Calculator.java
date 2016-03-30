import java.util.Scanner;

public class Calculator {
    public static void main (String []args) {
        // show the user the possibilities
        int operationWanted = 0;
        float number1 = 0;
        float number2 = 0;
        float result = 0;

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Hi, please enter the digit corresponding to the operation you want to do:");
        System.out.println("    1- Add");
        System.out.println("    2- Substract");
        System.out.println("    3- Mutiply");
        System.out.println("    4- Devide");
        System.out.println("------------------------------------------------------------------------------");

        Scanner inputOperation = new Scanner(System.in);
        operationWanted = inputOperation.nextInt();

        while (operationWanted != 1 && operationWanted != 2 && operationWanted != 3 && operationWanted != 4){
            System.out.println("Wrong input. Please enter a valid entry (1, 2, 3 or 4):");
            operationWanted = inputOperation.nextInt();
        }

        Scanner inputNumbers = new Scanner(System.in);

        System.out.println("Enter the 1st number");
        number1 = inputNumbers.nextInt();

        System.out.println("Enter the 2nd number");
        number2 = inputNumbers.nextInt();

        if (operationWanted == 1) {
            result = add(number1, number2);

        } else if (operationWanted == 2) {
            result = substract(number1, number2);

        } else if (operationWanted == 3) {
            result = multiply(number1, number2);

        } else if (operationWanted == 4) {
            result = devide(number1, number2);
        }

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("The result of your operation is : " + result);
        System.out.println("------------------------------------------------------------------------------");
    }

    public static float add(float a, float b){
        float result = a + b;
        return result;
    }

    public static float substract(float a, float b) {
        float result = a - b;
        return result;
    }


    public static float multiply(float a, float b) {
        float result = a * b;
        return result;
    }

    public static float devide(float a, float b){
        float result = a / b;
        return result;
    }

}
