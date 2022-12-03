package src.thread;

class isAlive_join implements Runnable {
    String name;
    Thread t;
    isAlive_join(String thName) {
        name = thName;
        t = new Thread(this, "new name");
        System.out.println("New thread: " + t);
    }
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println("Interrupted " + e);
        }
        System.out.println(name + " exiting...");
    }
}

class isAlive_joinDemo {
    public static void main(String[] args) {
        isAlive_join n1 = new isAlive_join("One");
        isAlive_join n2 = new isAlive_join("Two");
        isAlive_join n3 = new isAlive_join("Three");
        n1.t.start();
        n2.t.start();
        n3.t.start();
        System.out.println("Thread 1 is alive: " + n1.t.isAlive());
        System.out.println("Thread 2 is alive: " + n2.t.isAlive());
        System.out.println("Thread 3 is alive: " + n3.t.isAlive());
        try {
            n1.t.join();
            n2.t.join();
            n3.t.join();
        } catch(InterruptedException e) {
            System.out.println("Interrupted " + e);
        }
        System.out.println("Thread 1 is alive: " + n1.t.isAlive());
        System.out.println("Thread 2 is alive: " + n2.t.isAlive());
        System.out.println("Thread 3 is alive: " + n3.t.isAlive());
        System.out.println("Main thread exiting...");
    }
}