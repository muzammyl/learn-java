package src.inheritance;

class a2 {
    int i, j;
    a2(int a, int b) {
        i = a;
        j = b;
    }
    void show() {
        System.out.println("Value of i & j: " + i + " " + j + " respectively");
    }
}

class a3 extends a2 {
    int k;
    a3(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show() {
        // super.show(); //this will show superclass's method show()
        System.out.println("Value of k: " + k);
    }
}

class overRide {
    public static void main(String[] args) {
        a3 obj = new a3(3, 6, 9);
        obj.show(); // this will overRide superclass's show() method
    }
}

class a4 {
    int i, j;
    a4(int a, int b) {
        i = a;
        j = b;
    }
    void show() {
        System.out.println("Value of i & j: " + i + " " + j + " respectively");
    }
}

class a5 extends a2 {
    int k;
    a5(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show(String msg) {
        System.out.println(msg + k);
    }
}

class NONoverRide {
    public static void main(String[] args) {
        a5 obj = new a5(3, 6, 9);
        obj.show(); //this will call superclass's method
        obj.show("Value of k: "); //this will call subclass's method
    }
}

//Dynamic Method Dispatch
class a6 {
    void callme() {
        System.out.println("Inside 1st method");
    }
}

class a7 extends a6 {
    void callme() {
        System.out.println("Inside 2nd method");
    }
}

class a8 extends a7 {
    void callme() {
        System.out.println("Inside 3rd method");
    }
}

class dispatch {
    public static void main(String[] args) {
        a6 ob1 = new a6();
        a7 ob2 = new a7();
        a8 ob3 = new a8();
        a6 r;//reference variable
        r = ob1;//it acts as 'ob1' placeholder
        r.callme();
        r = ob2;//it acts as 'ob2' placeholder
        r.callme();
        r = ob3;//it acts as 'ob3' placeholder
        r.callme();
    }
}

class figure {
    double dim1, dim2;
    figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    double area() {
        System.out.println("Area of figure is undefined");
        return 0;
    }
}

class rectangle extends figure {
    rectangle(double a, double b) {
        super(a, b);
    }
    double area() {
        System.out.println("Area of rectangle");
        return dim1 * dim2;
    }
}

class triangle extends figure {
    triangle(double a, double b) {
        super(a, b);
    }
    double area() {
        System.out.println("Area of triangle");
        return (dim1 * dim2) /2;
    }
}

class areasOfFigure {
    public static void main(String[] args) {
        figure o1 = new figure(3, 9);
        rectangle o2 = new rectangle(5, 8);
        triangle o3 = new triangle(15, 8);
        figure fig;
        fig = o1;
        System.out.println("Area: " + fig.area());
        fig = o2;
        System.out.println("Area: " + fig.area());
        fig = o3;
        System.out.println("Area: " + fig.area());
    }
}