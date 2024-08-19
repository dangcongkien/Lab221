/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Date implements IValidation {

    private String date;

    public Date(String date) {
        this.date = date;
    }

    @Override
    public boolean isValid() {
        return date.matches("\\d{2}/\\d{2}/\\d{4}");
    }

}
