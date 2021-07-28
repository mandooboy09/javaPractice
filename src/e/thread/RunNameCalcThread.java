package e.thread;

public class RunNameCalcThread {
    public static void main(String[] args){
        RunNameCalcThread sample = new RunNameCalcThread();
        sample.runNameCalcThread();
    }
    public void runNameCalcThread(){
        NameCalcThread[] threads = new NameCalcThread[5];

        for(int loop = 0; loop < 5; loop++){
            threads[loop] = new NameCalcThread("thread" + loop, loop);
            threads[loop].start();
        }

    }
}
