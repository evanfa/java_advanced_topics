package course.intermediate.topic.thread.executors;

import java.util.concurrent.Callable;

public class CalculatorCallable implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        System.out.println("Computing...");
        Thread.sleep(1000);
        return 222;
    }
}
