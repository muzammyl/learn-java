package src.thread;

class sync1 {
    void call(String msg) {
        System.out.print("[" + msg + "]");
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println("Interrupted!");
        }
        System.out.println();
    }
}

class caller1 implements Runnable {
    String msg;
    sync1 target;
    Thread t;
    public caller1(sync1 targ, String m) {
        msg = m;
        target = targ;
        t = new Thread(this);
    }
    public void run() {
        synchronized(target) {
            target.call(msg);
        }
    }
}

class syncDemo1 {
    public static void main(String[] args) {
        sync1 target = new sync1();
        caller1 o1 = new caller1(target, "sync1");
        caller1 o2 = new caller1(target, "sync2");
        caller1 o3 = new caller1(target, "sync3");
        o1.t.start();
        o2.t.start();
        o3.t.start();
        try {
            o1.t.join();
            o2.t.join();
            o3.t.join();
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}