package src.thread;

class multiThread implements Runnable {
    String name;
    Thread t;
    multiThread(String thName) {
        name = thName;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
    }
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println(name + " interrupted");
        }
        System.out.println(name + " exiting...");
    }
}

class multiThreadDemo {
    public static void main(String[] args) {
        multiThread mt = new multiThread("One");
        multiThread mt1 = new multiThread("Two");
        multiThread mt2 = new multiThread("Three");
        mt.t.start();
        mt1.t.start();
        mt2.t.start();
        try {
            Thread.sleep(10000);
        } catch(InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Exiting main thread...");
    }
}