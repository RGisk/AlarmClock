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
    
    /**
     * Si el boolean es true suena el beep de la alarma.
     * @return 
     */
    public boolean BEEP(){
        if (bell == true)
            Toolkit.getDefaultToolkit().beep();
        return bell;
    }
   
}
