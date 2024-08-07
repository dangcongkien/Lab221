/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mains;

import Models.ArrayGenerator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Entry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of array: ");
        int size = sc.nextInt();
        
        System.out.println("Enter search value: ");
        int key = sc.nextInt();
        
        ArrayGenerator ag = new ArrayGenerator(size);
        
        ag.printArray();
        
        int index = ag.binarySearch(key);
        
        if (index != -1) {
            System.out.println("Found " + key + " at index " + index);
        } else {
            System.out.println("Not found " + key);
        }
    }
    
}
