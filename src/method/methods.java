package src.method;

class box {
    double width, height, depth;
    void volume() {
        System.out.println("Volume is " + width * height * depth);
    }
}

class boxDemo {
    public static void main(String[] args) {
        box b1 = new box();
        box b2 = new box();
        b1.width = 12;
        b1.height = 32;
        b1.depth = 21;
        b2.width = 2;
        b2.height = 4;
        b2.depth = 5;
        b1.volume();
        b2.volume();
    }
}

class box1 {
    double width, height, depth;
    double volume() {
        return width * height * depth;
    }
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

class boxDemo1 {
    public static void main(String[] args) {
        box1 b11 = new box1();
        box1 b12 = new box1();
        b11.setDim(4, 2, 1);
        b12.setDim(9, 12, 21);
        System.out.println("Volume of b11 is " + b11.volume());
        System.out.println("Volume of b12 is " + b12.volume());
    }
}