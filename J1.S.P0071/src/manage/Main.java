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
        TaskManager tm = new TaskManager();
        int id = 1;
        while (true) {            
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Display Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = tm.checkIntLimit(1, 4);
            switch (choice) {
                case 1:
                    tm.addTask(id);
                    id++;
                    break;
                case 2:
                    tm.deleteTask();
                    break;
                case 3:
                    tm.print();
                    break;
                case 4:
                    return;
            }
        }
    }
    
}
