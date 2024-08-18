/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manage;

import java.util.ArrayList;
import java.util.Scanner;
import model.Doctor;

/**
 *
 * @author Admin
 */
public class Validate {
    private final Scanner sc = new Scanner(System.in);
    
    private final ArrayList<Doctor> ld = new ArrayList<>();
    
    public int inputChoice(int min, int max) {
        while (true) {            
            try {
                int n = sc.nextInt();
                if (n < min || n > max) {
                    System.out.print("Please input in range 1 -> 5");
                }
                return n;
            } catch (NumberFormatException e) {
                System.out.print("Enter again: ");
            }
        }
    }
    
    public String inputString() {
        while (true) {            
            String s = sc.nextLine();
            
            if (s.isEmpty()) {
                System.out.print("Enter again: ");
            }
            else {
                return s;
            }
        }
    }
    
    public int inputIntNumber() {
        while (true) {            
            try {
                int n = sc.nextInt();
                if (n <= 0) {
                    System.out.print("Must be greater than 0.");
                }
                return n;
            } catch (NumberFormatException e) {
                System.out.print("Enter again: ");
            }
        }
    }
    
    public boolean inputYN() {
        while (true) {            
            String s = sc.nextLine();
            
            if (s.equalsIgnoreCase("Y")) {
                return true;
            }
            
            if (s.equalsIgnoreCase("N")) {
                return false;
            }
            System.out.println("Please input Y/y or N/n");
            System.out.print("Enter again: ");
        }
    }
    
    public boolean checkCodeExist(String code){
        for (Doctor doctor : ld) {
            if (code.equalsIgnoreCase(doctor.getCode())) {
                return false;
            }
        }
        return true;
    }
    
    public boolean checkDuplicate(String code,
            String name, String specialization, int availability) {
        //check from first to last list doctor
        for (Doctor doctor : ld) {
            if (code.equalsIgnoreCase(doctor.getCode())
                    && name.equalsIgnoreCase(doctor.getName())
                    && specialization.equalsIgnoreCase(doctor.getSpecialization())
                    && availability == doctor.getAvailability()) {
                return false;
            }
        }
        return true;
    }

//    //check user change infomation or not
//    public boolean checkChangeInfo(String code,
//            String name, String specialization, int availability) {
//        Doctor doctor = new Doctor();
//        if (doctor.getCode().equalsIgnoreCase(code)
//                && doctor.getName().equalsIgnoreCase(name)
//                && doctor.getSpecialization().equalsIgnoreCase(specialization)
//                && doctor.getAvailability() == availability) {
//            return false;
//        }
//        return true;
//    }
}
