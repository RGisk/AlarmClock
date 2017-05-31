/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarmclock;

import javax.swing.JOptionPane;

/**
 *
 * @author jquesadaabeijon
 */
public class Buttons {
    
    /**
     * Muestra el led de alarma encendido y hace que suene si la hora de la alarma es igual a la hora actual.
     */
    public void alarmOn(){
        Display.showLeds(false,true,false);
        if (AlarmClock.alarm.getHour()==AlarmClock.hour.getHour() && AlarmClock.alarm.getMinute()==AlarmClock.hour.getMinute())
            Speaker.bell=true;
        }
    /**
     * Muestra el led de alarma apagado.
     */
    public void alarmOff(){
        Display.showLeds(false,false,false);
    }
    /**
     * Configuración de la alarma. Muestra los leds de alarma/set encendidos y permite ajustar la hora de la alarma.
     */
    public void setAlarm(){
        Display.showLeds(false, true, true);
        AlarmClock.alarm = AlarmClock.alarm.withHour(Integer.parseInt(JOptionPane.showInputDialog("Introduce la hora: ")));
        AlarmClock.alarm = AlarmClock.alarm.withMinute(Integer.parseInt(JOptionPane.showInputDialog("Introduce los minutos: ")));
    }
    /**
     * Configuración de la hora. Muestra los leds de hora/set encendidos y permite ajustar la hora actual.
     */
    public void setHour(){
        Display.showLeds(true, false, true);
        AlarmClock.hour = AlarmClock.hour.withHour(Integer.parseInt(JOptionPane.showInputDialog("Introduce la hora: ")));
        AlarmClock.hour = AlarmClock.hour.withMinute(Integer.parseInt(JOptionPane.showInputDialog("Introduce los minutos: ")));
    }
   
}
