/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author Ngo Nhan
 */
public class DongHo implements Runnable {

    JLabel clock; 

    public DongHo(JLabel clock) {
        this.clock = clock;
    }
    @Override
    public void run() {
        while (true) {         
            Date now = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm aa");
            clock.setText(sdf.format(now));
            try { 
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
        }
    }
    
}
