package stc5.lesson4;

/**
 * Created by sergey on 07.04.17.
 */
public class Semaphore {
    boolean isProstrator = false;
    boolean isKvadrator = false;
    boolean isKubator = false;

    void acquire() throws InterruptedException {
        String className = this.getClass().getName();
        if (className == "ProstratorThread") {
            // NEED IMPLEMENT
        }
    }

    void release() {

    }
}
