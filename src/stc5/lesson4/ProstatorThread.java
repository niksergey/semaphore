package stc5.lesson4;

/**
 * Created by sergey on 07.04.17.
 */

class Consumer {
    private static int resultSum = 0;

    static void sum(int cub, int square, int bias) {
        resultSum += cub + square + bias;
    }
}

public class ProstatorThread implements Runnable {
    private Semaphore sem;
    private int param;

    ProstatorThread(Semaphore sem, int param) {
        this.sem = sem;
        this.param = param;
        new Thread(this).start();
    }

    public void run() {
        try {
            sem.acquire();
            Consumer.sum(0, 0, param);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sem.release();
    }
}

class KvadratorThread implements Runnable {
    private Semaphore sem;
    private int param;

    KvadratorThread(Semaphore sem, int param) {
        this.sem = sem;
        this.param = param;
        new Thread(this).start();
    }

    public void run() {
        try {
            sem.acquire();
            Consumer.sum(0, 0, param * param);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sem.release();
    }
}

class CubatorThread implements Runnable {
    private Semaphore sem;
    private int param;

    CubatorThread(Semaphore sem, int param) {
        this.sem = sem;
        this.param = param;
        new Thread(this).start();
    }

    public void run() {
        try {
            sem.acquire();
            Consumer.sum(0, 0, param * param * param);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sem.release();
    }
}