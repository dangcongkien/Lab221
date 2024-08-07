/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class ArrayGenerator {
    private int [] array;

    public ArrayGenerator(int size) {
        array = new int[size];
        generateArray(size);
        Arrays.sort(array);
    }
    
    private void generateArray(int size){
        Random random = new Random();
        
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }
    }
    
    public void printArray(){
        System.out.print("Sorted array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public int binarySearch(int key) {
        int left = 0, right = array.length - 1;
        // Thực hiện vòng lặp khi con trỏ bên trái không vượt qua con trỏ bên phải
        while (left <= right) {
            // Tính chỉ số giữa (mid) của đoạn mảng hiện tại
            int mid = left + (right - left) / 2;

            // Kiểm tra nếu phần tử tại vị trí mid bằng với key
            if (array[mid] == key) {
                return mid; // Trả về chỉ số mid nếu tìm thấy key
            }

            // Nếu phần tử tại vị trí mid nhỏ hơn key, dịch con trỏ bên trái lên sau mid
            if (array[mid] < key) {
                left = mid + 1;
            } 
            // Nếu phần tử tại vị trí mid lớn hơn key, dịch con trỏ bên phải xuống trước mid
            else {
                right = mid - 1;
            }
        }

        // Trả về -1 nếu không tìm thấy key trong mảng
        return -1;
    }
}
