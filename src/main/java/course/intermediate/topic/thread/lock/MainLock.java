package course.intermediate.topic.thread.lock;

public class MainLock {
    public static void main(String[] args) {

        /*
        Implement objects to be used as a control access to
        shared resources for our threads

        A thread can goback if wants to block an object that is
        previously blocked for another trhead.

        Or can be interrupted a blockage.
         */

        System.out.println("Running Interfaz Lock");

        Printer impresora = new Printer();
        Thread h1 = new Thread(new Print(impresora),"H1");
        Thread h2 = new Thread(new Print(impresora),"H2");
        Thread h3 = new Thread(new Print(impresora),"H3");
        Thread h4 = new Thread(new Print(impresora),"H4");
        Thread h5 = new Thread(new Print(impresora),"H5");
        Thread h6 = new Thread(new Print(impresora),"H6");

        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();

    }
}
