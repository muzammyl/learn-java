package src.constructor;

class box4 {
    double width, height, depth;
    box4(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    box4() {
        width = -1;
        height = -1;
        depth = -1;
    }
    box4(double len) {
        width = height = depth = len;
    }
    double volume() {
        return width*height*depth;
    }
}

class boxDemo4 {
    public static void main(String[] args) {
        box4 b41 = new box4(21, 11, 31);
        box4 b42 = new box4();
        box4 cube = new box4(6);
        System.out.println("Volume b41: " + b41.volume());
        System.out.println("Volume b42: " + b42.volume());
        System.out.println("Volume of cube: " + cube.volume());
    }
}