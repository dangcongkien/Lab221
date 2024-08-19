/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manage;

import java.util.ArrayList;
import java.util.Scanner;
import model.Contact;

/**
 *
 * @author Admin
 */
public class ContactManager {
    private final ArrayList<Contact> lc = new ArrayList<>();
    private final Scanner in = new Scanner(System.in);
    private final String VALID_PHONE = "[(]?[0-9]{3}[)]?[-. ]?[0-9]{3}[-. ]?[0-9]{4}"
            + "|[0-9]{3}[-][0-9]{3}[-][0-9]{4}[ a-z0-9]+";
    
    public void createContact(int id) {
        System.out.print("Enter name: ");
        String fullName = checkInputString();
        System.out.print("Enter group: ");
        String group = checkInputString();
        System.out.print("Enter address: ");
        String address = checkInputString();
        System.out.print("Enter phone: ");
        String phone = checkInputPhone();
        
        String[] nameParts = fullName.split(" ");
        String firstname = nameParts[0];
        String lastname = nameParts[1];
        
        Contact c = new Contact(id, fullName, group, address, phone, firstname, lastname);
        lc.add(c);
        System.err.println("Add successful.");
    }

    public void printAllContact() {
        System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Name",
                "First name", "Last name", "Group", "Address", "Phone");
        //print infomation of contact from first to last list contact
        for (Contact contact : lc) {
            System.out.printf("%-5d%-25s%-20s%-20s%-20s%-20s%-20s\n",
                    contact.getContactId(), contact.getFullName(),
                    contact.getFirstName(), contact.getLastName(),
                    contact.getGroup(), contact.getAddress(), contact.getPhone());
        }
    }

    public void deleteContactd() {
        System.out.print("Enter id: ");
        int id = checkInputInt();
        Contact contactDelete = getContactById(id);
        if (contactDelete == null) {
            System.err.println("Not found contact.");
            return;
        } else {
            lc.remove(contactDelete);
        }
        System.err.println("Delete successful.");
    }

    private Contact getContactById(int id) {
        for (Contact contact : lc) {
            if (contact.getContactId() == id) {
                return contact;
            }
        }
        return null;
    }
    
    public int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    System.out.print("Out of range ");

                }
                return result;
            } catch (NumberFormatException e) {
                System.out.print("Enter again: ");
            }
        }
    }

    private String checkInputString() {
        //loop until user input correct
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
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
            } catch (Exception e) {
                System.err.println("Please input number");
                System.out.print("Enter again: ");
            }
        }
    }

    private String checkInputPhone() {
        //loop until user input correct
        while (true) {
            String result = checkInputString();
            if (result.matches(VALID_PHONE)) {
                return result;
            }
            System.err.println("Please input Phone flow\n"
                    + "1234567890\n"
                    + "123-456-7890 \n"
                    + "123-456-7890 x1234\n"
                    + "123-456-7890 ext1234\n"
                    + "(123)-456-7890\n"
                    + "123.456.7890\n"
                    + "123 456 7890");
            System.out.print("Enter again: ");
        }
    }
}
