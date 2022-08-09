package src.packages.p1;

class derived extends protection {
    derived() {
        System.out.println("derived constructor");
        System.out.println("n = " + n);
        // System.out.println("n-pri = " + n_pri); //class only
        System.out.println("n-pro = " + n_pro);
        System.out.println("n-pub = " + n_pub);
    }
}