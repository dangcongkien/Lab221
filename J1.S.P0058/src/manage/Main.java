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
        DictionaryManager dm = new DictionaryManager();
        while (true) {
            System.out.println("1. Add Word");
            System.out.println("2. Delete Word");
            System.out.println("3. Translate");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = dm.checkInputIntLimit(1, 4);
            switch (choice) {
                case 1:
                    dm.addNewWord();
                    break;
                case 2:
                    dm.deleteWord();
                    break;
                case 3:
                    dm.searchWord();
                    break;
                case 4:
                    return;
            }
        }
    }

}
