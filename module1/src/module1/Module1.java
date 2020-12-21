
package module1;

import java.util.TimerTask;
import java.util.Timer;

public class Module1 {
    
    
    int s =0;
    Timer timer = new Timer();
    TimerTask task = new TimerTask(){
        public void run(){
            s++;
            System.out.println(s);
        
        }
    
    
    };
    
    public void start(){
        timer.scheduleAtFixedRate(task, 1000, 1000);
    
    }
    public static void main(String[] args) throws ClassNotFoundException {
       new db_login().setVisible(true);
   
    }
   
}
