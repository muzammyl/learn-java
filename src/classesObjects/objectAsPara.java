package src.classesObjects;

class objectAsPara {
    int a, b;
    objectAsPara(int i, int j) {
        a = i;
        b = j;
    }
    boolean equalto(objectAsPara o) {
        if(o.a == a && o.b == b) {
            return true;
        }
        else {
            return false;
        }
    }
}

class apply {
    public static void main(String[] args) {
        objectAsPara o1 = new objectAsPara(12, 13);
        objectAsPara o2 = new objectAsPara(12, 13);
        objectAsPara o3 = new objectAsPara(1, 2);
        System.out.println("o1 = o2: " + o1.equalto(o2));
        System.out.println("o2 = o3: " + o2.equalto(o3));
    }
}

class box5 {
    double width, height, depth;
    box5(box5 b) {
        width = b.width;
        height = b.height;
        depth = b.depth;
    }
    box5(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    box5() {
        width = -1;
        height = -1;
        depth = -1;
    }
    box5(double len) {
        width = height = depth = len;
    }
    double volume() {
        return width*height*depth;
    }
}

class boxdemo5 {
    public static void main(String[] args) {
        box5 b51 = new box5(10, 20, 30);
        box5 b52 = new box5();
        box5 cube = new box5(7);
        box5 clone = new box5(b51);
        System.out.println("Volume of b51: " + b51.volume());
        System.out.println("Volume of b52: " + b52.volume());
        System.out.println("Volume of cube: " + cube.volume());
        System.out.println("Volume of clone: " + clone.volume());
    }
}