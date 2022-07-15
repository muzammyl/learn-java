package src.constructor;

class box2 {
    double width, height, depth;
    box2() {
        System.out.println("Initializing Box...");
        width = 10;
        height = 21;
        depth = 31;
    }
    double volume() {
        return width * height * depth;
    }
}

class boxDemo2 {
    public static void main(String[] args) {
        box2 b21 = new box2();
        box2 b22 = new box2();
        System.out.println("Volume of b21 is " + b21.volume());
        System.out.println("Volume of b22 is " + b22.volume());
    }
}

class box3 {
    double width, height, depth;
    box3(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    void volume() {
        System.out.println("Volume is " + width*height*depth);
    }
}

class boxDemo3 {
    public static void main(String[] args) {
        box3 b31 = new box3(4, 7, 11);
        box3 b32 = new box3(21, 54, 11);
        b31.volume();
        b32.volume();
    }
}