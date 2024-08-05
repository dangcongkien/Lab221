/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.s.p0010;

import Models.ArrayGenerate;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J1SP0010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int size = inputSize();
        
        ArrayGenerate arrayGenerate = new ArrayGenerate(size);
        
        arrayGenerate.printArray();
        
        int search = inputSearchValue();
        
        int index = arrayGenerate.linearSearch(search);
        
        System.out.println("Found " + search + " at index " + index);
    }

    private static int inputSize() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter number of array: ");
                int size = sc.nextInt();
                if (size <= 0) {
                    System.out.println("Size must be greater than 0.");
                }
                return size;
            } catch (Exception e) {
                System.out.println("Size must be number.");
            }

        }
    }

    private static int inputSearchValue() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter search value: ");
                int size = sc.nextInt();
                if (size <= 0) {
                    System.out.println("Search value must be greater than 0.");
                }
                return size;
            } catch (Exception e) {
                System.out.println("Search value must be number.");
            }

        }
    }

}
