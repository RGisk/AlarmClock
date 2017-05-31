/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarmclock;

import java.awt.Toolkit;

/**
 *
 * @author jquesadaabeijon
 */
public class Speaker {

    static boolean bell;
    private String melodia;

    static public void playAlarm() {
        bell = true;
    }

    public static void stopAlarm() {
        bell = false;

    }

}
