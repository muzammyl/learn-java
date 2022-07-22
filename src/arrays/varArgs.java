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

class overloadVarargs {
    static void test(int ... v) {
        System.out.print("Number of args: " + v.length + " Contents: ");
        for(int x: v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    static void test(Boolean ... v) {
        System.out.print("Number of args: " + v.length + " Contents: ");
        for(boolean x: v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    static void test(String msg, int ... v) {
        System.out.print(msg + v.length + " Contents: ");
        for(int x: v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        test(4, 3, 0);
        test(false, true, false, true);
        test("Number of args: ", 83, 21);
    }
}