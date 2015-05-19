
public final class semaphore {
    private int valor;
    public semaphore() {
        valor = 0;
    }

    public semaphore(int v) {
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