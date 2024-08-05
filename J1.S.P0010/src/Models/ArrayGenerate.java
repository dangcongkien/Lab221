/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class ArrayGenerate extends ArrayOperations{
    private int[] array;

    public ArrayGenerate(int size) {
        array = new int[size];
        generateArray(size);
    }

    @Override
    public void generateArray(int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }
    }

    @Override
    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println("");
    }

    @Override
    public int linearSearch(int search) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                return i;
            }

        }
        return -1;
    }
    
    
}
