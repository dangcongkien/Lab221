/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class Counter {

    private HashMap<Character, Integer> charCounter;
    private HashMap<String, Integer> wordCounter;

    public Counter(String content) {
        charCounter = new HashMap<>();
        wordCounter = new HashMap<>();
        countCharacters(content);
        countWords(content);
    }

    private void countCharacters(String content) {
        for (char ch : content.toCharArray()) {
            if (Character.isSpaceChar(ch)) {
                continue;
            }
            charCounter.put(ch, charCounter.getOrDefault(ch, 0) + 1);
        }
    }

    private void countWords(String content) {
        StringTokenizer tokenizer = new StringTokenizer(content);
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            wordCounter.put(token, wordCounter.getOrDefault(token, 0) + 1);
        }
    }

    public void display() {
        System.out.println(wordCounter);
        System.out.println(charCounter);
    }

}
