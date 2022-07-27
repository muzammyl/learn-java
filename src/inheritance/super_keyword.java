package src.inheritance;

class box {
    private double width, height, depth;

    box(box b) {
        width = b.width;
        height = b.height;
        depth = b.depth;
    }
    box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    box() {
        width = -1;
        height = -1;
        depth = -1;
    }
    box(double len) {
        width = height = depth = len;
    }
    double volume() {
        return width * height * depth;
    }
}

class weightBox extends box{
    double weight;
    weightBox(weightBox w) {
        super(w);
        weight = w.weight;
    }
    weightBox(double w, double h, double d, double w1) {
        super(w, h, d);
        weight = w1;
    }
    weightBox() {
        super();
        weight = -1;
    }
    weightBox(double l, double m) {
        super(l);
        weight = m;
    }
}

class demoSuper {
    public static void main(String[] args) {
        weightBox b1 = new weightBox(4, 2, 5, 21);
        weightBox b2 = new weightBox();
        weightBox b3cube = new weightBox(7, 21);
        weightBox b4clone = new weightBox(b1);

        System.out.println();
        System.out.println("Volume of box1 is " + b1.volume());
        System.out.println("Weight of box1 is " + b1.weight);
        System.out.println();
        System.out.println("Volume of box2 is " + b2.volume());
        System.out.println("Weight of box2 is " + b2.weight);
        System.out.println();
        System.out.println("Volume of cube is " + b3cube.volume());
        System.out.println("Weight of cube is " + b3cube.weight);
        System.out.println();
        System.out.println("Volume of clone is " + b4clone.volume());
        System.out.println("Weight of clone is " + b4clone.weight);
        System.out.println();
    }
}