package course.intermediate.topic.thread;

public class RunThreads {
    public static void main(String[] args) {
        //GenericThreadCreation gTC = new GenericThreadCreation();
        //HiRunnable hR = new HiRunnable(2000);

        Thread h1 = new Thread(new HiRunnable(2000),"Hilo 1");
        h1.start();
        Thread h2 = new Thread(new HiRunnable(3041),"Hilo 2");
        h2.start();
        Thread h3 = new Thread(new HiRunnable(1893),"Hilo 3");
        h3.start();

        /*try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        h1.interrupt();
         */

        while(h1.isAlive()||h2.isAlive()){

        }

        //

    }
}
