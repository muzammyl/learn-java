package src.inheritance;

class a2 {
    int i, j;
    a2(int a, int b) {
        i = a;
        j = b;
    }
    void show() {
        System.out.println("Value of i & j: " + i + " " + j + " respectively");
    }
}

class a3 extends a2 {
    int k;
    a3(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show() {
        // super.show(); //this will show superclass's method show()
        System.out.println("Value of k: " + k);
    }
}

class overRide {
    public static void main(String[] args) {
        a3 obj = new a3(3, 6, 9);
        obj.show(); // this will overRide superclass's show() method
    }
}

class a4 {
    int i, j;
    a4(int a, int b) {
        i = a;
        j = b;
    }
    void show() {
        System.out.println("Value of i & j: " + i + " " + j + " respectively");
    }
}

class a5 extends a2 {
    int k;
    a5(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show(String msg) {
        System.out.println(msg + k);
    }
}

class NONoverRide {
    public static void main(String[] args) {
        a5 obj = new a5(3, 6, 9);
        obj.show(); //this will call superclass's method
        obj.show("Value of k: "); //this will call subclass's method
    }
}