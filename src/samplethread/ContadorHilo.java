package samplethread;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author victorm
 */
public class ContadorHilo extends Thread{
    private boolean isrun=false;
    private JTextField txtv;
    
    public ContadorHilo(JTextField txtv){
        this.txtv=txtv;
    }
    
    public synchronized void detener(){
        isrun=false;
    }
    
     @Override
    public void run() {
        isrun=true;
        while(isrun){
            try{
                long v=Long.parseLong(txtv.getText());
                v++;
                txtv.setText(String.valueOf(v));
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
