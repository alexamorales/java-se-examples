import java.util.concurrent.Callable;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksii.Lisun
 * Date: 10/23/13
 * Time: 4:11 PM
 */
public class Multithreading implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + ":" + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);
        Multithreading multithreading1 = new Multithreading();
        Multithreading multithreading2 = new Multithreading();
        Thread thread1 = new Thread(multithreading1);
        Thread thread2 = new Thread(multithreading2);


        /*thread1.start();
        thread1.join();

        thread2.start();*/

    }
}
