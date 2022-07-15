package src.thisKeyword;

class box4 {
    double width, height, depth;
    box4(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    void volume() {
        System.out.println("Volume is " + width*height*depth);
    }
}

class boxDemo3 {
    public static void main(String[] args) {
        box4 b31 = new box4(4, 7, 11);
        box4 b32 = new box4(21, 54, 11);
        b31.volume();
        b32.volume();
    }
}