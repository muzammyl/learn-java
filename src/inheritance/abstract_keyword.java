package src.inheritance;

abstract class figure1 {
    double dim1, dim2;
    figure1(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    abstract double area();
}

class rectangle1 extends figure1 {
    rectangle1(double a, double b) {
        super(a, b);
    }
    double area() {
        System.out.println("Rectangle area:");
        return dim1 * dim2;
    }
}

class triangle1 extends figure1 {
    triangle1(double a, double b) {
        super(a, b);
    }
    double area() {
        System.out.println("Triangle area:");
        return (dim1 * dim2) / 2;
    }
}

class absDemo {
    public static void main(String[] args) {
        // figure o1 = new figure(5, 3); //this is illegal cause abstract is hidden
        rectangle1 o2 = new rectangle1(8, 10);
        triangle1 o3 = new triangle1(21, 12);
        figure1 fig; //correct! cause there's no object
        fig = o2;
        System.out.println("Area is " + fig.area());
        fig = o3;
        System.out.println("Area is " + fig.area());
    }
}