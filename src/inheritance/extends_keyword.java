package src.inheritance;

class a {
    int i, j;
    void showij() {
        System.out.println("i & j: " + i + " " + j);
    }
}

class b extends a {
    int k;
    void showk() {
        System.out.println("value of k is " + k);
    }
    void sum() {
        System.out.println("i + j + k : " + (i+j+k));
    }
}

class extendsDemo {
    public static void main(String[] args) {
        a supera = new a();
        b subb = new b();
        supera.i = 11;
        supera.j = 21;
        System.out.println("Contents of super object:");
        supera.showij();
        System.out.println();
        System.out.println("Contents of sub object:");
        subb.k = 76;
        subb.showk();
        System.out.println();
        subb.sum();
    }
}