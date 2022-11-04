package course.intermediate.topic.thread.executors;

public class GreetingsExecutors implements Runnable{

    @Override
    public void run() {
        System.out.println("_Hey! "+Thread.currentThread().getName());
    }
}
