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
        FormatManager fm = new FormatManager();
        System.out.print("Phone number: ");
        String phone = fm.checkInputPhone();
        System.out.print("Date: ");
        String date = fm.checkInputDate();
        System.out.print("Email: ");
        String email = fm.checkInputEmail();
    }

}
