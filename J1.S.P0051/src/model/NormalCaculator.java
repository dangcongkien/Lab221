/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class NormalCaculator {
    private double memory;

    public NormalCaculator() {
    }

    public NormalCaculator(double memory) {
        this.memory = 0.0;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }
    
    public void calculate(double number, String operator) {
        switch (operator) {
            case "+":
                memory += number;
                break;
            case "-":
                memory -= number;
                break;
            case "*":
                memory *= number;
                break;
            case "/":
                if (number != 0) {
                    memory /= number;
                } else {
                    System.out.println("Lỗi: Không thể chia cho 0.");
                }
                break;
            case "^":
                memory = Math.pow(memory, number);
                break;
            default:
                System.out.println("Toán tử không hợp lệ.");
        }
        System.out.println("Memory: " + memory);
    }
}
