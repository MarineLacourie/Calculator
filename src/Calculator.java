import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main (String []args) {
        int operationWanted;
        float number1;
        float number2;
        float result = 0;

        Scanner inputOperation = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Hi, please enter the digit corresponding to the operation you want to do:");
        System.out.println("    1- Add");
        System.out.println("    2- Substract");
        System.out.println("    3- Mutiply");
        System.out.println("    4- Devide");
        System.out.println("------------------------------------------------------------------------------");

        operationWanted = inputOperation.nextInt();

//        while (true) {
//            System.out.println("------------------------------------------------------------------------------");
//            System.out.println("Hi, please enter the digit corresponding to the operation you want to do:");
//            System.out.println("    1- add");
//            System.out.println("    2- substract");
//            System.out.println("    3- Mutiply");
//            System.out.println("    4- Devide");
//            System.out.println("------------------------------------------------------------------------------");
//            try {
//                operationWanted = inputOperation.nextInt();
//                break;
//            } catch (InputMismatchException ignore) {
//                System.out.println("Invalid input.Please enter a valid entry (1, 2, 3 or 4):");
//                operationWanted = inputOperation.nextInt();
//            } finally {
//                if (inputOperation.hasNextInt()){
//                    success = true;
//                }
//            }
//        }

        Scanner inputNumbers = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the 1st number");
            try {
                number1 = Float.parseFloat(inputNumbers.next());
                break;
            } catch (NumberFormatException ignore) {
                System.out.println("Invalid input.");
            }
        }

        while (true) {
            System.out.println("Enter the 2nd number");
            try {
                number2 = Float.parseFloat(inputNumbers.next());
                break;
            } catch (NumberFormatException ignore) {
                System.out.println("Invalid input.");
            }
        }

        if (operationWanted == 1) {
            result = add.addNumbers(number1, number2);

        } else if (operationWanted == 2) {
            result = substract.substractNumbers(number1, number2);

        } else if (operationWanted == 3) {
            result = multiply.multiplyNumbers(number1, number2);

        } else if (operationWanted == 4) {
            result = divide.divideNumbers(number1, number2);
        }

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("The result of your operation is : " + result);
        System.out.println("------------------------------------------------------------------------------");


        //Ask operation again
        System.out.println("Do you want to do another operation? YES/NO");
        Scanner nextOperation = new Scanner(System.in);
        String answerNextOperation = nextOperation.nextLine();
        String answerNextNextOperation = "";

        if (answerNextOperation.equalsIgnoreCase("YES")) {
            while ((answerNextNextOperation.equalsIgnoreCase("YES")));
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("Hi, please enter the digit corresponding to the operation you want to do:");
            System.out.println("    1- Add");
            System.out.println("    2- Substract");
            System.out.println("    3- Mutiply");
            System.out.println("    4- Devide");
            System.out.println("------------------------------------------------------------------------------");

            operationWanted = inputOperation.nextInt();

            while (true) {
                System.out.println("Enter the 1st number");
                try {
                    number1 = Float.parseFloat(inputNumbers.next());
                    break;
                } catch (NumberFormatException ignore) {
                    System.out.println("Invalid input.");
                }
            }

            while (true) {
                System.out.println("Enter the 2nd number");
                try {
                    number2 = Float.parseFloat(inputNumbers.next());
                    break;
                } catch (NumberFormatException ignore) {
                    System.out.println("Invalid input.");
                }
            }

            if (operationWanted == 1) {
                result = add.addNumbers(number1, number2);

            } else if (operationWanted == 2) {
                result = substract.substractNumbers(number1, number2);

            } else if (operationWanted == 3) {
                result = multiply.multiplyNumbers(number1, number2);

            } else if (operationWanted == 4) {
                result = divide.divideNumbers(number1, number2);
            }

            System.out.println("------------------------------------------------------------------------------");
            System.out.println("The result of your operation is : " + result);
            System.out.println("------------------------------------------------------------------------------");

            System.out.println("Do you want to do another operation? YES/NO");
            answerNextOperation = nextOperation.nextLine();
            if (answerNextNextOperation.equalsIgnoreCase("NO")) {
                System.out.println("Thank you for having used this awesome Calculator");
            } else {
                System.out.println("Wrong input. Please run the program again.");
            }

        } else if (answerNextOperation.equalsIgnoreCase("NO") ||answerNextNextOperation.equalsIgnoreCase("NO")) {
            System.out.println("Thank you for having used this awesome Calculator");
        } else {
            System.out.println("Wrong input. Please run the program again.");
        }
    }
}
