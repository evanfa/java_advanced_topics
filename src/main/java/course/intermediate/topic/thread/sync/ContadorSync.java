package course.intermediate.topic.thread.sync;

public class ContadorSync {

    private int c = 0;

    public synchronized void incrementVal(){
        c++;
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Waiting..."+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void decrementVal(){
        c--;
    }

    public int getVal(){
        return c;
    }

}
