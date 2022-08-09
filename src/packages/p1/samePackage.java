package src.packages.p1;

class samePackage {
    samePackage() {
        protection p = new protection();
        System.out.println("same package constructor");
        System.out.println("n = " + p.n);
        // System.out.println("n-pri = " + p.n_pri); //class only
        System.out.println("n-pro = " + p.n_pro);
        System.out.println("n-pub = " + p.n_pub);
    }
}