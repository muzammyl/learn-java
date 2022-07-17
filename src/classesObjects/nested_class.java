package src.classesObjects;

class outer {
    int outerX = 10;
    void test() {
        inner in = new inner();
        in.display();
    }
    class inner {
        void display() {
            System.out.println("Value of X is " + outerX);
        }
    }
}

class nestedDemo {
    public static void main(String[] args) {
        outer o = new outer();
        o.test();
    }
}