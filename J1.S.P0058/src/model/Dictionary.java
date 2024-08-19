/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class Dictionary {
    private HashMap<String, Word> dictionary;

    public Dictionary() {
        dictionary = new HashMap<>();
    }

    public void addWord(String english, String vietnamese) {
        if (dictionary.containsKey(english)) {
            System.out.println("Word already exists.");
        } else {
            dictionary.put(english, new Word(english, vietnamese));
            System.out.println("Word added successfully.");
        }
    }

    public void deleteWord(String english) {
        if (dictionary.containsKey(english)) {
            dictionary.remove(english);
            System.out.println("Word deleted successfully.");
        } else {
            System.out.println("Word not found.");
        }
    }

    public void searchWord(String english) {
        Word word = dictionary.get(english);
        if (word != null) {
            System.out.println("Vietnamese: " + word.getVietnamese());
        } else {
            System.out.println("Word not found.");
        }
    }

    public boolean checkKeywordExist(String english) {
        return dictionary.containsKey(english);
    }
}
