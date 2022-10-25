package course.intermediate.topic.thread;

public class GenericThreadCreation {
    public GenericThreadCreation() {
        Thread h1 = new Thread(new HiRunnable(),"Hilo 1");
        h1.start();
        Thread h2 = new Thread(new HiRunnable(),"Hilo 2");
        h2.start();
        Thread h3 = new Thread(new HiRunnable(),"Hilo 2");
        h3.start();

        HiRunnable h4 = new HiRunnable();
        h4.start();

    }
}
