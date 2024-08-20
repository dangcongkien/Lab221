/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class NumberProcess {
    private ArrayList<Integer> perfectSquares;
    private ArrayList<Integer> oddNumbers;
    private ArrayList<Integer> evenNumbers;
    private ArrayList<Integer> allNumbers;

    public NumberProcess() {
        perfectSquares = new ArrayList<>();
        oddNumbers = new ArrayList<>();
        evenNumbers = new ArrayList<>();
        allNumbers = new ArrayList<>();
    }
    
    public void processNumbers(String inputString) {
        String[] numberStrings = inputString.replaceAll("\\D+", ",").split(",");
        
        for (String numStr : numberStrings) {
            if (numStr.isEmpty()) continue;
            int number = Integer.parseInt(numStr);
            allNumbers.add(number);
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
            if (isSquareNumber(number)) {
                perfectSquares.add(number);
            }
        }
    }

    private boolean isSquareNumber(int n) {
        if (Math.sqrt(n) * Math.sqrt(n) == n) {
            return true;
        }
        return false;
    }

    public void displayNumbers() {
        System.out.println("Perfect Square Numbers: " + perfectSquares);
        System.out.println("Odd Numbers: " + oddNumbers);
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("All Numbers: " + allNumbers);
    }
}
