package src.inheritance;

class b2 {
    final void meth() { //prevent overriding
        System.out.println("This is final method!");
    }
}

class b3 extends b2 {
    // void meth() {
    //     System.out.println("This is illegal!");
    // }
}

class finalDemo {
    public static void main(String[] args) {
        b3 ob = new b3();
        ob.meth();
    }
}