package src.thread;

class sync {
    synchronized void call(String msg) {
        System.out.print("[" + msg + "]");
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println("Interrupted!");
        }
        System.out.println();
    }
}

class caller implements Runnable {
    String msg;
    sync target;
    Thread t;
    public caller(sync targ, String m) {
        msg = m;
        target = targ;
        t = new Thread(this);
    }
    public void run() {
        target.call(msg);
    }
}

class syncDemo {
    public static void main(String[] args) {
        sync target = new sync();
        caller o1 = new caller(target, "sync1");
        caller o2 = new caller(target, "sync2");
        caller o3 = new caller(target, "sync3");
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