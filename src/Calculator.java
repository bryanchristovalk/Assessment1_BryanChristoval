import java.util.Scanner;
/**
 * Name: Bryan Christoval
 * Student ID: 13368201
 *
 * Date: 13/04/2018
 */
public class Calculator {
    public static void main(String args[]) {

        String name;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Welcome to SimpleCALC!, Please enter your name");
        name = inputDevice.next();

        mainMenu(name, inputDevice);
    }

    private static void mainMenu(String name, Scanner inputDevice) {
        int equation = 1;
        boolean question = true;
        double number1;
        double number2;

        System.out.println("Welcome " + name + " , Please enter your first number:");
        number1 = inputDevice.nextInt();
        System.out.println("Please enter your second number:");
        number2 = inputDevice.nextInt();

        while (question) {
            System.out.println("Please choose your equation");
            System.out.println("1) +");
            System.out.println("2) -");
            System.out.println("3) X");
            System.out.println("4) /");

            equation = inputDevice.nextInt();
            if (equation == 1) {

                System.out.println("you have chosen operation 1. (+)");
                System.out.println("Your first number is:" + number1);
                System.out.println("Your second number is:" + number2);
                System.out.println("Answer:");
                double result = number1 + number2;
                System.out.println(number1 + "+" + number2 +  "= " + String.format("%.0f", result));
                closingText(name, inputDevice);
                question = false;

            } else if (equation == 2) {
                System.out.println("you have chosen operation 1. (+)");
                System.out.println("Your first number is:" + number1);
                System.out.println("Your second number is:" + number2);
                System.out.println("Answer:");
                double result = number1 - number2;
                System.out.println(number1 + "-" + number2 + " = " + String.format("%.0f", result));
                closingText(name, inputDevice);
                question = false;

            } else if (equation == 3) {
                System.out.println("you have chosen operation 1. (+)");
                System.out.println("Your first number is:" + number1);
                System.out.println("Your second number is:" + number2);
                System.out.println("Answer:");
                double result = number1 * number2;
                System.out.println(number1 + "X" + number2 + "=" + String.format("%.0f",  result));
                closingText(name, inputDevice);
                question = false;

            } else if (equation == 4) {
                System.out.println("you have chosen operation 1. (+)");
                System.out.println("Your first number is:" + number1);
                System.out.println("Your second number is:" + number2);
                System.out.println("Answer:");
                double result = number1 / number2;
                System.out.println(number1 + "/" + number2 + "=" + String.format("%.2f", result));
                closingText(name, inputDevice);
                question = false;
            }
        }

    }

    private static void closingText(String name, Scanner inputDevice) {

        int closingAns;
        System.out.println("Choose between (A/B)");
        System.out.println("1) Start Again");
        System.out.println("2) Quit");
        closingAns = inputDevice.nextInt();
        while (true){
            if (closingAns == 1){
                mainMenu(name, inputDevice);
                break;
            }else if (closingAns == 2){
                System.out.println("Thank You!");
                break;
            }
            else {
                System.out.println("Choose between (1/2)");
                System.out.println("1) Start Again");
                System.out.println("2) Quit");
                closingAns = inputDevice.nextInt();
            }
        }

    }

}

