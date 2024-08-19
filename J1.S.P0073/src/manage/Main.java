/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manage;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ExpenseManager em = new ExpenseManager();
        int id = 1;
        while (true) {
            System.out.println("1. Add an expense");
            System.out.println("2. Display all expenses");
            System.out.println("3. Delete an expense");
            System.out.println("4. Quit");
            System.out.print("Your choice: ");
            int choice = em.checkIntLimit(1, 4);
            switch (choice) {
                case 1:
                    em.addExpense(id);
                    id++;
                    break;
                case 2:
                    em.displayExpense();
                    break;
                case 3:
                    em.deleteExpense();
                    break;
                case 4:
                    return;
            }
        }
    }
    
}
