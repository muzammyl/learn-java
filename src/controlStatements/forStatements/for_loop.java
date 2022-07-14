package src.controlStatements.forStatements;

class for_loop {
    public static void main(String[] args) {
        int x;
        for(x = 0; x < 5; x++) { // these are code blocks {}
            System.out.println("x is " + x);
        }
    }
}

class comma {
    public static void main(String[] args) {
        int a, b;
        for(a = 0, b = 5; a < b; a++, b--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}