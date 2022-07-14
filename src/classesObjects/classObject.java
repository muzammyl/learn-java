package src.classesObjects;

class box {
    double width, height, depth;
}

class boxDemo {
    public static void main(String[] args) {
        box b1 = new box();
        box b2 = new box();
        double volume;
        b1.width = 10.5;
        b1.height = 5.3;
        b1.depth = 15.0;
        b2.width = 2.8;
        b2.height = 7.1;
        b2.depth = 3.9;
        volume = b1.width * b1.height * b1.depth;
        System.out.println("Volume of box1 is: " + volume);
        volume = b2.width * b2.height * b2.depth;
        System.out.println("Volume of box2 is: " + volume);
    }
}