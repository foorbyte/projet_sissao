/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;
import javax.management.Notification;
import org.controlsfx.control.Notifications;
//import org.controlsfx.control.Notifications;

/**
 *
 * @author freexx
 */
public class NewMain extends TimerTask{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("date.NewMain.main()");
         //   int delay = 0;
       // Timer timer = new java.util.Timer();

        int day, month, year;
      int second, minute, hour;
      GregorianCalendar date = new GregorianCalendar();
 
      day = date.get(Calendar.DAY_OF_MONTH);
      month = date.get(Calendar.MONTH);
      year = date.get(Calendar.YEAR);
 
      second = date.get(Calendar.SECOND);
      minute = date.get(Calendar.MINUTE);
      hour = date.get(Calendar.HOUR);
 
      System.out.println("Current date is  "+day+"/"+(month+1)+"/"+year);
      System.out.println("Current time is  "+hour+" : "+minute+" : "+second);
      
       // Notification n = new Notifications.create()
                            //.title("Message send failure")
                            //.text("essai")
                            //.showError();
                           // .graphic(img)
                    //.onAction(e -> launchLivestreamer(s.getUrl()))
                    //.position(Pos.BOTTOM_RIGHT);
                    //.hideAfter(Duration.seconds(NOTIFICATION_DURATION))
                    //.darkStyle()
                    //.show();
 /*   TrayNotification tray = new TrayNotification();
tray.setTitle("okkkkkk");
        tray.setMessage("essai");
        //tray.setNotification(notification);
        tray.showAndWait();
      */
     TimerTask maTask = new MaTask();
        Timer timer = new Timer();
        timer.schedule(new MaTask(), 1000, 5000);
        
         TimerTask task = new NewMain();
        timer.schedule(task, 2000, 5000); 
//https://www.journaldev.com/1050/java-timer-timertask-example
//https://www.jmdoudoux.fr/java/dej/chap-planification_taches.htm
    
}

    @Override
    public void run() {
System.out.println(new Date() + " Execution de ma tache");
int i = 0;
        System.out.println("Timer ran " + ++i); 
    }

 public static class MaTask extends TimerTask {

        @Override
        public void run() {
            System.out.println(new Date() + " Execution de ma tache");
        }
          
      }

    }