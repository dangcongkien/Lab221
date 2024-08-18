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
        Validate vd = new Validate();
        DoctorManager dm = new DoctorManager();
        while (true) {
            System.out.println("1. Add doctor");
            System.out.println("2. Update doctor");
            System.out.println("3. Delete doctor");
            System.out.println("4. Search doctor");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = vd.inputChoice(1, 5);
            dm.printDoctor();
            switch (choice) {
                case 1:
                    dm.addDoctor();
                    break;
                case 2:
                    dm.updateDoctor();
                    break;
                case 3:
                    dm.deleteDoctor();
                    break;
                case 4:
                    dm.searchDoctor();
                    break;
                case 5:
                    return;
            }
        }
    }

}
