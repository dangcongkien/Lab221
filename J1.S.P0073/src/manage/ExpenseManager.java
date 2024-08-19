/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manage;

import java.util.ArrayList;
import java.util.Scanner;
import model.Expenses;

/**
 *
 * @author Admin
 */
public class ExpenseManager {
    private final Scanner in = new Scanner(System.in);
    private final ArrayList<Expenses> le = new ArrayList<>();
    private final String DATE_VALID = "^\\d{1}|[0-3]{1}\\d{1}-[a-zA-Z]{3}-\\d{4}$";
    
    public void addExpense(int id) {
        System.out.print("Enter Date: ");
        String date = checkInputDate();
        System.out.print("Enter Amount: ");
        double amount = checkInputDouble();
        System.out.print("Enter Content: ");
        String content = checkInputString();
        Expenses e = new Expenses(id, date, amount, content);
        le.add(e);
        System.out.println("Add successfull.");
    }

    public void displayExpense() {
        if (le.isEmpty()) {
            System.err.println("List Expenses empty");
            return;
        }
        double total = 0;
        System.out.printf("%-7s%-20s%-20s%-20s\n", "ID", "Date", "Amount of money", "Content");
        for (int i = 0; i < le.size(); i++) {
            System.out.printf("%-7d%-20s%-20.0f%-20s\n", le.get(i).getId(), le.get(i).getDate(),
                    le.get(i).getAmount(), le.get(i).getContent());
            total += le.get(i).getAmount();
        }
        System.out.printf("Total: %-20.0f\n", total);
    }

    private Expenses checkIdExist(int id) {
        for (Expenses expenses : le) {
            if (expenses.getId() == id) {
                return  expenses;
            }
        }
        return null;
    }

    public void deleteExpense() {
        System.out.print("Enter id: ");
        int id = checkInputInt();
        Expenses expenses = checkIdExist(id);
        if (expenses != null) {
            le.remove(expenses);
            System.out.println("Delete an expense successful");
        } else {
            System.err.println("Delete an expense fail");
        }
    }
    
    public int checkIntLimit(int min, int max) {
        while (true) {
            try {
                int n = Integer.parseInt(in.nextLine());
                if (n < min || n > max) {
                    System.out.println("Out of range: ");
                }
                return n;
            } catch (NumberFormatException ex) {
                System.err.println("Re-input");
            }
        }
    }

    private String checkInputDate() {
        while (true) {
            try {
                String result = in.nextLine().trim();
                if (result.matches(DATE_VALID)) {
                    return result;
                } else {
                    System.err.println("Re-input");
                }
            } catch (NumberFormatException ex) {
                System.err.println("Re-input");
            }
        }
    }

    private double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine());
                return result;
            } catch (NumberFormatException ex) {
                System.err.println("Re-input");
            }
        }
    }

    private String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.length() == 0) {
                System.err.println("Re-input");
            } else {
                return result;
            }

        }
    }

    private int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                return result;
            } catch (NumberFormatException ex) {
                System.err.println("Re-input");
            }
        }
    }
}
