package src.exception;

class throw_keyword {
    static void demo() {
        try {
            throw new NullPointerException("demo");
        } catch(NullPointerException e) {
            System.out.println("Exception: " + e);
            throw e;
        }
    }
    public static void main(String[] args) {
        try {
            demo();
        } catch(NullPointerException e) {
            System.out.println("Recaught: " + e);
        }
    }
}