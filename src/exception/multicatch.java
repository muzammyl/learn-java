package src.exception;

class multicatch {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = {1};
            c[99] = 32;
        } catch(ArithmeticException e) {
            System.out.println("Exception: " + e);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }
    }
}