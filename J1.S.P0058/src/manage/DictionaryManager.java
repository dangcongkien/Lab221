/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manage;

import java.util.Scanner;
import model.Dictionary;

/**
 *
 * @author Admin
 */
public class DictionaryManager {
    private final Dictionary dictionary = new Dictionary();
    private static final Scanner in = new Scanner(System.in);

    public void addNewWord() {
        System.out.print("Enter English: ");
        String english = checkInputString();
        if (dictionary.checkKeywordExist(english)) {
            if (!checkInputYN()) {
                return;
            }
        }
        System.out.print("Enter Vietnamese: ");
        String vietnamese = checkInputString();
        dictionary.addWord(english, vietnamese);
    }

    public void deleteWord() {
        System.out.print("Enter English: ");
        String english = checkInputString();
        dictionary.deleteWord(english);
    }

    public void searchWord() {
        System.out.print("Enter English: ");
        String english = checkInputString();
        dictionary.searchWord(english);
    }
    

    public int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in range [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    private String checkInputString() {
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

    private boolean checkInputYN() {
        System.out.print("Do you want to replace(Y/N)? ");
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }
}
