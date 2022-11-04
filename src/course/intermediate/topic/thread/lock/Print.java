package course.intermediate.topic.thread.lock;

public class Print implements Runnable{

    private Printer impresora;

    public Print(Printer impresora){
        this.impresora = impresora;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+": Wants to print");
        impresora.imprimir(new Object());
    }
}
