package course.intermediate.topic.thread.sync;

public class RunThreadSync {
    /*
    Se plantean dos hilos que estan sincronizados para que uno ejecute y bloquee la
    intervención del segundo hilo que ejerce acciones sobre el misma variable.

    Es necesario recordar el proceso para realizar el cambio:
    - Obtener Variable
    - Bloquear (Evitar que otro hilo interfiera).
    - Guardar Valor

    Si ambos metodos estan sumando...
    El metodo getVal no está sincronizado por tanto no tiene que esperar a que la variable
    este liberada para obtener el valor.

    Output:


     */
    public static void main(String[] args) {
        ContadorSync cSync = new ContadorSync();
        Thread thrSync = new Thread(new Runnable() {
            @Override
            public void run() {

                cSync.incrementVal();
                System.out.println("Counter val: "+cSync.getVal());

            }
        },"Thread Sum");

        Thread thrSyncM = new Thread(new Runnable() {
            @Override
            public void run() {
                //cSync.incrementVal();
                //cSync.decrementVal();
                System.out.println("Counter val: "+cSync.getVal());

            }
        },"Thread Substraction");

        thrSync.start();
        thrSyncM.start();
    }
}
