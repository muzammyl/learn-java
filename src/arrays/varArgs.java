package src.arrays;

class varArgs {
    static void vatest(String msg, int ... v) {
        System.out.print(msg + v.length + "Contents: ");
        for(int x: v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        vatest("arg1", 10);
        vatest("arg2", 3, 2, 1);
        vatest("arg3");
    }
}