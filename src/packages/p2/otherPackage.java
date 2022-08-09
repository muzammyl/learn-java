package src.packages.p2;

class otherPackage {
    otherPackage() {
        src.packages.p1.protection obj = new src.packages.p1.protection();
        System.out.println("other package constructor");
        // System.out.println("n = " + obj.n); //class or package only
        // System.out.println("n-pri = " + obj.n_pri); //class only
        // System.out.println("n-pro = " + obj.n_pro); //class, subclass or package only
        System.out.println("n-pub = " + obj.n_pub);
    }
}