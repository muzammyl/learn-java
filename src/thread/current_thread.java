package src.thread;

class current_thread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
        t.setName("main thread");
        System.out.println("After name change: " + t);
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}