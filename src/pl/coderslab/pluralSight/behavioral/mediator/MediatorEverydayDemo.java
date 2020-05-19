package pl.coderslab.pluralSight.behavioral.mediator;

import javax.print.attribute.standard.Media;
import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class MediatorEverydayDemo {

    private Timer timer;

    public MediatorEverydayDemo(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
        timer.schedule(new RemindTaskWithoutBeep(), seconds * 1000);
    }

    class RemindTask extends TimerTask {
        public void run() {
            System.out.println("Time's up");
        }
    }

    class RemindTaskWithoutBeep extends TimerTask {
        public void run() {
            System.out.println("Now time's really up");
            timer.cancel();
        }
    }

    public static void main(String[] args) {
        System.out.println("About to schedule task");
        new MediatorEverydayDemo(3);
        System.out.println("Task scheduled");
    }
}
