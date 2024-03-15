package Multithreading;

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {

        //this is the main thread. every other thread forks out from this main thread. It gets instantiated automatically whenever the program executes
        Thread t = Thread.currentThread();
        System.out.println("hellu");
        NewThread nt = new NewThread();
        nt.t.start();
        SecondWay sw = new SecondWay();
        sw.start();
        for (int i = 0; i < 5; i++) {
//            Thread.sleep(1000);
//            Thread.currentThread().setName("test rk " + i);
//            System.out.println("parent rk " + i);
        }

        nt.t.join(); //the control stays here until the thread is concluded. the control doesn't move a single line. this is the way parent thread can use to wait for children so that it can conclude at the very end.
        System.out.println("new thread completed");
        sw.join();
        System.out.println("Second way completed");
        System.out.println("parent finished " + Thread.currentThread());

//        Thread qw = new Thread(this, "test");

    }
}

//one of the ways to create thread
class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "child thread");
        System.out.println(t.getName());
    }


    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(5);
//                Thread.currentThread().setName("child rk " + i);
//                throw new InterruptedException();
                System.out.println("child rk " + i);

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("child finished");
    }
}

class SecondWay extends Thread {
    SecondWay() {
        super("secondWay");
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(500);
//                Thread.currentThread().setName("child rk " + i);
//                throw new InterruptedException();
                System.out.println("second child rk " + i);

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("child finished");
    }
}