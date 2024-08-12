/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manage;

import model.BMICaculator;
import java.util.Scanner;
import model.NormalCaculator;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        NormalCaculator normalCaculator = new NormalCaculator();
        while (true) {
            System.out.println("1. Normal Calculator");
            System.out.println("2. BMI Calculator");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = checkInputChoice(1, 3);
            switch (choice) {
                case 1:
                    double memory;
                    System.out.print("Enter number: ");
                    memory = checkInputDouble();
                    normalCaculator.calculate(memory, "+");
                    boolean continueCalculation = true;
                    
                    while (continueCalculation) {  
                        System.out.print("Enter operator: ");
                        String operator = checkInputOperator();
                        
                        if (operator.equalsIgnoreCase("=")) {
                            continueCalculation = false;
                        } else {
                            memory = inputNumber();
                            normalCaculator.calculate(memory, operator);
                        }
                    }
                    
                    System.out.println("Result: " + normalCaculator.getMemory());
                    break;
                case 2:
                    System.out.print("Enter Weight(kg): ");
                    double weight = checkInputDouble();
                    System.out.print("Enter Height(cm): ");
                    double height = checkInputDouble();
                    BMICaculator bMICaculator = new BMICaculator(weight, height);

                    System.out.printf("BMI number: %.2f\n", bMICaculator.caculatorBMI());
                    System.out.println("BMI Status: " + bMICaculator.bmiStatus());
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

    private static int checkInputChoice(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    private static double checkInputDouble() {
        //loop until user input correct
        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
                System.out.print("Enter again: ");
            }
        }
    }
    
    private static double inputNumber() {
        System.out.print("Enter number: ");
        double number = checkInputDouble();
        return number;
    }
    
    private static String checkInputOperator() {
        //loop until user input correct
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
            } else if (result.equalsIgnoreCase("+") || result.equalsIgnoreCase("-")
                    || result.equalsIgnoreCase("*") || result.equalsIgnoreCase("/")
                    || result.equalsIgnoreCase("^") || result.equalsIgnoreCase("=")) {
                return result;
            } else {
                System.err.println("Please input (+, -, *, /, ^)");
            }
            System.out.print("Enter again: ");
        }
    }

}
