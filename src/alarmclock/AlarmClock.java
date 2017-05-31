/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarmclock;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.time.LocalTime;

/**
 *
 * @author jquesadaabeijon
 */
public class AlarmClock {

    static public LocalTime hour;
    static public LocalTime alarm;
    
    public static void main(String[] args) {
        
        hour = LocalTime.now();
        alarm = LocalTime.now();
        
        
        Buttons but1 = new Buttons();
        Speaker sp1 = new Speaker();
        Display dis1 = new Display();

        int op = 0;

/**
 * Creo un switch case que sirve para elegir entre las diferentes opciones del despertador.
 */
        do {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(">>>MENU<<< \n1. Visualizar la hora \n2. Visualizar la alarma \n3. Configurar la hora \n4. Configurar la alarma \n5. Alarma ON \n6. Alarma OFF \n7. Salir"));

            } catch (HeadlessException | NumberFormatException e) {
                System.out.println(e.getMessage());

            }
            switch (op) {

                case 1:
                    dis1.visualizeHour();
                    break;
                case 2:
                    dis1.visualizeAlarm();
                    break;
                case 3:
                    but1.setHour();
                    break;
                case 4:
                    but1.setAlarm();
                    break;
                case 5:
                    but1.alarmOn();
                    break;
                case 6:
                    but1.alarmOff();
                    break;
                case 7:
                    System.exit(0);
            }

        } while (op!=0);
    }

}
