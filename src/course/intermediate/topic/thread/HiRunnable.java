package course.intermediate.topic.thread;

public class HiRunnable extends Thread {
    @Override
    public void run() {
        System.out.println("Hiiiiiiiiiiiiii: "+getName());
    }
}
