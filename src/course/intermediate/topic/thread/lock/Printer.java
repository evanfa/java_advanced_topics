package course.intermediate.topic.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Printer {

    private final Lock impresoraLock = new ReentrantLock();

    public void imprimir(Object o){

        /*
        We can use impresoraLock.tryLock() to try the block if
        is sucess execute if not should consider other lock
        object to execute in parallel.

        Exm.
        impresoraMalaLock = new ReentrantLock();
        impresoraMalaLock.lock();
         */

        impresoraLock.lock();

        try{
            double duracion = Math.random()*10000;
            System.out.println(Thread.currentThread().getName()+": Printing... during: "+duracion/1000);
            Thread.sleep((long) duracion);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println(Thread.currentThread().getName()+": Printer is completed");
            impresoraLock.unlock();
        }
    }

}
