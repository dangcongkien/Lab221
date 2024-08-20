/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manage;

import java.util.Scanner;
import model.CharactorProcess;
import model.NumberProcess;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        NumberProcess np = new NumberProcess();
        CharactorProcess cp = new CharactorProcess();
        
        System.out.print("Input String: ");
        String input = sc.nextLine();
        np.processNumbers(input);
        cp.processCharacters(input);
        np.displayNumbers();
        cp.displayCharacters();
    }
    
}
