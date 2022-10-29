package src.exception;

class chainedExceptions {
    static void demo() {
        NullPointerException e = new NullPointerException("top layer");
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }
    public static void main(String[] args) {
        try {
            demo();
        } catch(NullPointerException e) {
            System.out.println("Caught: " + e);
            System.out.println("Solid cause: " + e.getCause());
        }
    }
}