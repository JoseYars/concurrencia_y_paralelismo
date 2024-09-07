package concurrencia_y_paralelismo;
class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println(this.getName() + " - Estado: " + this.getState() + " - Iniciado");
            Thread.sleep(2000);
            System.out.println(this.getName() + " - Estado: " + this.getState() + " - Finalizado");
        } catch (InterruptedException e) {
            System.out.println(this.getName() + " - Estado: " + this.getState() + " - Interrumpido");
        }
    }
}