package course.intermediate.topic.thread.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunExecutors {
    public static void main(String[] args) {
        /*
        Thread -> Task
        Executor split both concepts

        Class Executor launch a specified task for a runnable
        Extends from:
         - ExecutorService
         - ScheduledExecutorService

ExecutorService
         That can accept a Call instead Runnable and can
         return a value.

         Return object -Future- that allows to verify the state
         of a task

ScheduledExecutorService
        Schedule a task in the future.

         */


        Thread h1 = new Thread(new GreetingsExecutors(),"H1");

        h1.start();

        /*
        SINGLE THREAD
         */
        //ExecutorService exS = Executors.newSingleThreadExecutor();
        /*
        POOL THREAD
         */
        ExecutorService exS = Executors.newFixedThreadPool(2);
        /*exS.submit(new GreetingsExecutors());
        exS.submit(new GreetingsExecutors());
        exS.submit(new GreetingsExecutors());
        exS.submit(new GreetingsExecutors());
        exS.submit(new GreetingsExecutors());

        exS.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Other Task");
            }
        });
        */

        //Using Callable
        Future<Integer> fVal = exS.submit(new CalculatorCallable());
        //Validation if complete
        Integer result = 0;
        try {
            result = fVal.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("¿Task Complete? "+fVal.isDone());
        System.out.println("Result: "+result);


        //Wait until the end execution of task and don't allow new tasks.
        //exS.shutdown();
        //End execution
        exS.shutdownNow();

    }
}
