package src.thread;

class newThread implements Runnable {
    Thread t;
    newThread() {
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
    }
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Child thread: " + i);
                Thread.sleep(500);
            }
        } catch(InterruptedException e) {
            System.out.println("Child interrupted");
        }
        System.out.println("Exiting child thread...");
    }
}

class threadDemo {
    public static void main(String[] args) {
        newThread nt = new newThread();
        nt.t.start();
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println("main thread interrupted");
        }
        System.out.println("Exiting main thread...");
    }
}

class newThread1 extends Thread {
    newThread1() {
        super("Demo thread");
        System.out.println("Child thread: " + this);
    }
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Child thread: " + i);
                Thread.sleep(500);
            }
        } catch(InterruptedException e) {
            System.out.println("Child interrupted");
        }
        System.out.println("Exiting child thread");
    }
}

class threadDemo1 {
    public static void main(String[] args) {
        newThread1 nt1 = new newThread1();
        nt1.start();
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println("main thread interrupted");
        }
        System.out.println("Main thread exiting...");
    }
}