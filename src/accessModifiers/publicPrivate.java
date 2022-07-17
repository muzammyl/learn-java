package src.accessModifiers;

class publicPrivate {
    int a;
    public int b;
    private int c;
    void setc(int i) {
        c = i;
    }
    int getc() {
        return c;
    }
}

class demo {
    public static void main(String[] args) {
        publicPrivate pp = new publicPrivate();
        pp.a = 10;
        pp.b = 20;
        // pp.c = 30; this will generate an error!
        pp.setc(30);
        System.out.println("Value of a, b & c: " + pp.a + ", " + pp.b + ", " + pp.getc() + " respectively.");
    }
}