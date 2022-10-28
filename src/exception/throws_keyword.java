package src.exception;

class throws_keyword {
    static void throwsdemo() throws IllegalAccessError {
        System.out.println("inside throwsdemo");
        throw new IllegalAccessError();
    }
    public static void main(String[] args) {
        try {
            throwsdemo();
        } catch(IllegalAccessError e) {
            System.out.println("Caught: " + e);
        }
    }
}