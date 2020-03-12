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
public class DaysInMonth {
    public byte DaysInMonth(short year, byte month) {
        byte days = 0;
        switch (month) {
            case 1:
                days = 31;
                break;
            case 2: 
                if (year % 400 == 0 ) {
                    days = 29;
                } else if (year % 100 == 0){
                    days = 28;
                } else if(year % 4 == 0){
                   days = 29;
                } else{
                    days = 28;
                }
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
        }
        return days;
    }
}
