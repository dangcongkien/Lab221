/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import model.Date;
import model.Email;
import model.PhoneNumber;

/**
 *
 * @author Admin
 */
public class FormatManager {

    private final Scanner sc = new Scanner(System.in);

    public String checkInputPhone() {
        while (true) {
            String result = checkInputString();
            PhoneNumber pn = new PhoneNumber(result);

            if (!pn.isValid()) {
                System.err.println("Phone number must be 10 digits");
            } else {
                return result;
            }
        }
    }
    
    public String checkInputDate() {
        while (true) {
            String dateCheck = checkInputString();
            Date date = new Date(dateCheck);

            if (!date.isValid()) {
                System.err.println("Date must be in format dd/MM/yyyy.");
            } else {
                return dateCheck;
            }
        }
    }
    
    public String checkInputEmail() {
        while (true) {
            String emailCheck = checkInputString();
            Email email = new Email(emailCheck);
            if (!email.isValid()) {
                System.err.println("Email must be in correct format");
                System.out.print("Email: ");
            } else {
                return emailCheck;
            }
        }
    }

    private String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty.");
            } else {
                return result;
            }
        }
    }
}
