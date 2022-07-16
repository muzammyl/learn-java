package src.method;

class overloadMethod {
    void test() {
        System.out.println("No parameter");
    }
    void test(int a) {
        System.out.println("a: " + a);
    }
    double test(double d) {
        return d*d;
    }
}

class overload {
    public static void main(String[] args) {
        overloadMethod om = new overloadMethod();
        om.test(45);
        System.out.println("double overload result is " + om.test(321.123));
    }
}