package e.thread.practice;
import java.util.Date;

public class TimerThread extends Thread{
    public void run(){
        printCurrentTime();
    }
    public void printCurrentTime(){
        try {
            for (int loop = 1; loop <= 10; loop++) {
                Date currentTime = new Date();
                System.out.println(currentTime + " " + System.currentTimeMillis());
                Thread.sleep(900);
                reduceGap();
            }
        }
        catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
    public void reduceGap(){
        long currentTime = System.currentTimeMillis();
        long timeMod = currentTime % 1000;
        try {
            Thread.sleep(1000 - timeMod);
        }
        catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
