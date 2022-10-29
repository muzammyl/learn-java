package src.exception;

class myException extends Exception {
    private int detail;
    myException(int a) {
        detail = a;
    }
    public String toString() {
        return "myException[" + detail + "]";
    }
}

class myExceptionDemo {
    static void compute(int a) throws myException {
        System.out.println("Compute(" + a + ")");
        if(a > 10) {
            throw new myException(a);
        }
        System.out.println("Solid exit");
    }
    public static void main(String[] args) {
        try {
            compute(1);
            compute(10);
            compute(30);
        } catch(myException e) {
            System.out.println("Caught: " + e);
        }
    }
}