package course.intermediate.topic.thread;

public class HiRunnable extends Thread {
    int periodTime;
    HiRunnable(int miliseconds){
        periodTime = miliseconds;
    }

    @Override
    public void run() {

        System.out.println("Running Threads ....");

        for (int i = 0; i < 2; i++) {
            //if(Thread.interrupted()){

            //}

            try {
                Thread.sleep(periodTime);
            }catch (InterruptedException e){
                e.printStackTrace();
                System.out.println("End Execution: "+Thread.currentThread().getName());
                return;
            }
            System.out.println("Name: "+Thread.currentThread().getName());
        }
    }
}
