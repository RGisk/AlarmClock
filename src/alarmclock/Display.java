/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarmclock;

import java.time.Clock;

/**
 *
 * @author jquesadaabeijon
 */
public class Display extends AlarmClock {
    
    static boolean ledClock, ledAlarm, ledSet, button;

//    public void switchBetweenHourandAlarm() {
//        if (button == false) {
//            visualizeHour();
//        } else {
//            visualizeAlarm();
//        }
//    }
/**
 * Visualiza la hora por consola.
 */
    public void visualizeHour() {
        System.out.println(AlarmClock.hour.getHour()+" : "+AlarmClock.hour.getMinute());
    }
/**
 * Visualiza la alarma por consola.
 */
    public void visualizeAlarm() {
        System.out.println(AlarmClock.alarm.getHour()+" : "+AlarmClock.alarm.getMinute());
    }
    
    public static void showLeds(boolean clock,boolean alarm,boolean set){

        ledClock = clock;
        ledAlarm = alarm;
        ledSet = set;
    }

}
