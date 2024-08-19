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
        ContactManager cm = new ContactManager();
        int id = 1;
        while (true) {
            System.out.println("1. Add a contact.");
            System.out.println("2. Display all contact.");
            System.out.println("3. Delete a contact.");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = cm.checkInputIntLimit(1, 4);
            switch (choice) {
                case 1:
                    cm.createContact(id);
                    id++;
                    break;
                case 2:
                    cm.printAllContact();
                    break;
                case 3:
                    cm.deleteContactd();
                    break;
                case 4:
                    return;
            }
        }
    }

}
