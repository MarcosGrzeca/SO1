package so1;

public final class Semaphore {
    private int valor;
    public Semaphore() {
        valor = 0;
    }

    public Semaphore(int v) {
        valor = v;
    }

    public synchronized void down() {
        while (valor <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

        valor--;
    }

    public synchronized void up() {
        valor++;
        notifyAll();
    }
}