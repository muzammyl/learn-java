package src.exception;

class finally_keyword {
    static void demoA() {
        try {
            System.out.println("inside demoA");
            throw new RuntimeException();
        } finally {
            System.out.println("demoA finally");
        }
    }
    static void demoB() {
        try {
            System.out.println("inside demoB");
            return;
        } finally {
            System.out.println("demoB finally");
        }
    }
    static void demoC() {
        try {
            System.out.println("inside demoC");
        } finally {
            System.out.println("demoC finally");
        }
    }
    public static void main(String[] args) {
        try {
            demoA();
        } catch(Exception e) {
            System.out.println("Exception: " + e);
        }
        demoB();
        demoC();
    }
}