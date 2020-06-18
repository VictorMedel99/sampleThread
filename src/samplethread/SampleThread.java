
package samplethread;

/**
 *
 * @author victorm
 */
public class SampleThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hilo1 h1=new Hilo1(1000,"p1");
        Hilo1 h2=new Hilo1(2000,"p2");
        
        h1.start();
        h2.start();
    }
    
}
