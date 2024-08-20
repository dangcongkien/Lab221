/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class CharactorProcess {
    private String uppercase = "";
    private String lowercase = "";
    private String specialCharacters = "";
    private String allCharacters = "";
    
    public void processCharacters(String inputString) {
        for (char ch : inputString.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercase += ch;
            } else if (Character.isLowerCase(ch)) {
                lowercase += ch;
            } else if (!Character.isDigit(ch)) {
                specialCharacters += ch;
            }
            if (!Character.isWhitespace(ch)) {
                allCharacters += ch;
            }
        }
    }

    public void displayCharacters() {
        System.out.println("Uppercase Characters: " + uppercase);
        System.out.println("Lowercase Characters: " + lowercase);
        System.out.println("Special Characters: " + specialCharacters);
        System.out.println("All Characters: " + allCharacters);
    }
}
