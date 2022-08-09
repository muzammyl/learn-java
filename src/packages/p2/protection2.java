package src.packages.p2;

class protection2 extends src.packages.p1.protection {
    protection2() {
        System.out.println("derived other package constructor");
        // System.out.println("n = " + n); //class or package only
        // System.out.println("n-pri = " + n_pri); //class only
        System.out.println("n-pro = " + n_pro);
        System.out.println("n-pub = " + n_pub);
    }
}