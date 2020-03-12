/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thangha.function;

/**
 *
 * @author Admin
 */
public class IsValidDate {
    DaysInMonth days = new DaysInMonth();
    public boolean IsValidDate(byte day, byte month, short year){
        boolean check = false;
        if (month >= 1 && month <= 12) {
            if (day >= 1) {
                check = (day <= days.DaysInMonth(year, month));
            } else{
                check = false;
            }
        } else{
            check = false;
        }
        return check;
    }
}
