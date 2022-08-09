package src.packages.p1;

public class protection {
    int n = 7;
    private int n_pri = 3;
    protected int n_pro = 5;
    public int n_pub = 9;
    public protection() {
        System.out.println("base constructor");
        System.out.println("n = " + n);
        System.out.println("n-pri = " + n_pri);
        System.out.println("n-pro = " + n_pro);
        System.out.println("n-pub = " + n_pub);
    }
}