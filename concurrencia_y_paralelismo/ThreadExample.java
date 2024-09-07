package concurrencia_y_paralelismo;

public class ThreadExample {
    public static void main(String[] args) {
        // Crear hilos
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();

        // Mostrar estado antes de iniciar los hilos
        System.out.println(thread1.getName() + " - Estado antes de iniciar: " + thread1.getState());
        System.out.println(thread2.getName() + " - Estado antes de iniciar: " + thread2.getState());
        System.out.println(thread3.getName() + " - Estado antes de iniciar: " + thread3.getState());

        // Iniciar hilos
        thread1.start();
        thread2.start();
        thread3.start();

        // Mostrar estado después de iniciar los hilos
        System.out.println(thread1.getName() + " - Estado después de iniciar: " + thread1.getState());
        System.out.println(thread2.getName() + " - Estado después de iniciar: " + thread2.getState());
        System.out.println(thread3.getName() + " - Estado después de iniciar: " + thread3.getState());

        try {
            // Esperar que los hilos terminen
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Mostrar estado después de que los hilos han terminado
        System.out.println(thread1.getName() + " - Estado después de finalizar: " + thread1.getState());
        System.out.println(thread2.getName() + " - Estado después de finalizar: " + thread2.getState());
        System.out.println(thread3.getName() + " - Estado después de finalizar: " + thread3.getState());
    }
}
