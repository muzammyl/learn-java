package src.classesObjects;

class test {
    int a;
    test(int i) {
        a = i;
    }
    test incrByTen() {
        test temp = new test(a+10);
        return temp;
    }
}

class retObj {
    public static void main(String[] args) {
        test t1 = new test(3);
        test t2;
        t2 = t1.incrByTen();
        System.out.println("t1.a: " + t1.a);
        System.out.println("t2.a: " + t2.a);
        t2 = t2.incrByTen();
        System.out.println("t2.a after second increase: " + t2.a);
    }
}