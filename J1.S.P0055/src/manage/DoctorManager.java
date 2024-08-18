/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manage;

import java.util.ArrayList;
import model.Doctor;

/**
 *
 * @author Admin
 */
public class DoctorManager {

    private final ArrayList<Doctor> ld = new ArrayList<>();
    private final Validate validate = new Validate();

    public DoctorManager() {
        ld.add(new Doctor("d1", "Nghia", "Orthopedics", 3));
        ld.add(new Doctor("d2", "Phuong", "Obsentrics", 2));
        ld.add(new Doctor("d3", "Lien", "Orthodontics", 1));
        ld.add(new Doctor("d4", "Son", "Orthopedics", 3));
        ld.add(new Doctor("d5", "Kien", "Obsentrics", 2));
        ld.add(new Doctor("d6", "Duy", "Orthodontics", 1));

    }

    public void addDoctor() {
        System.out.print("Enter code: ");
        String code = validate.inputString();

        if (!validate.checkCodeExist(code)) {
            System.err.println("Code exist.");
            return;
        }

        System.out.print("Enter name: ");
        String name = validate.inputString();
        System.out.print("Enter specialization: ");
        String specialization = validate.inputString();
        System.out.print("Enter availability: ");
        int availability = validate.inputIntNumber();

        if (!validate.checkDuplicate(code, name, specialization, availability)) {
            System.err.println("Duplicate.");
            return;
        }
        ld.add(new Doctor(code, name, specialization, availability));
        System.err.println("Add successful.");
        printDoctor();
    }

    public void updateDoctor() {
        Doctor doctor = new Doctor();
        System.out.print("Enter code: ");
        String code = validate.inputString();
        if (!validate.checkCodeExist(code)) {
            System.err.println("Not found doctor");
            return;
        }

        System.out.print("Enter code: ");
        String codeUpdate = validate.inputString();
        doctor = getDoctorByCode(code);
        System.out.print("Enter name: ");
        String name = validate.inputString();
        System.out.print("Enter specialization: ");
        String specialization = validate.inputString();
        System.out.print("Enter availability: ");
        int availability = validate.inputIntNumber();
//        if (!validate.checkChangeInfo(code, name, specialization, availability)) {
//            System.err.println("No change");
//            return;
//        }
        doctor.setCode(codeUpdate);
        doctor.setName(name);
        doctor.setSpecialization(specialization);
        doctor.setAvailability(availability);
        System.err.println("Update successful");
        printDoctor();
    }

    public void deleteDoctor() {
        System.out.print("Enter code: ");
        String code = validate.inputString();
        Doctor doctor = getDoctorByCode(code);
        if (doctor == null) {
            System.err.println("Not found doctor.");
            return;
        } else {
            ld.remove(doctor);
        }
        System.err.println("Delete successful.");
        printDoctor();
    }

    private Doctor getDoctorByCode(String code) {
        for (Doctor doctor : ld) {
            if (doctor.getCode().equalsIgnoreCase(code)) {
                return doctor;
            }
        }
        return null;
    }

    private ArrayList<Doctor> listFoundByName(String name) {
        ArrayList<Doctor> listFoundByName = new ArrayList<>();
        for (Doctor doctor : ld) {
            if (doctor.getName().contains(name)) {
                listFoundByName.add(doctor);
            }
        }
        return listFoundByName;
    }
    
    public void printDoctor() {
        System.out.printf("%-10s%-15s%-25s%-20s\n", "Code", "Name",
                    "Specialization", "Availability");
            for (Doctor doctor : ld) {
                System.out.printf("%-10s%-15s%-25s%-20d\n", doctor.getCode(),
                        doctor.getName(), doctor.getSpecialization(),
                        doctor.getAvailability());
            }
    }

    public void searchDoctor() {
        System.out.print("Enter name: ");
        String nameSearch = validate.inputString();
        ArrayList<Doctor> listFoundByName = listFoundByName(nameSearch);
        if (listFoundByName.isEmpty()) {
            System.err.println("List empty.");
        } else {
            System.out.printf("%-10s%-15s%-25s%-20s\n", "Code", "Name",
                    "Specialization", "Availability");
            for (Doctor doctor : listFoundByName) {
                System.out.printf("%-10s%-15s%-25s%-20d\n", doctor.getCode(),
                        doctor.getName(), doctor.getSpecialization(),
                        doctor.getAvailability());
            }
        }
    }

}
