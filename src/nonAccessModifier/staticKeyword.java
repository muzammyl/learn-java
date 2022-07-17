package src.nonAccessModifier;

class staticKeyword {
    static int a = 42;
    static int b = 10;
    static void callme() {
        System.out.println("b = " + b);
    }
}

class staticDemo {
    public static void main(String[] args) {
        staticKeyword.callme();
        System.out.println("a = " + staticKeyword.a);
    }
}