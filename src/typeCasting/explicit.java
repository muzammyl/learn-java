package src.typeCasting;

public class explicit {
    public static void main(String[] args) {
        byte b;
        int i = 356;
        double d = 215.786;

        System.out.println("Conversion of int to byte.");
        b = (byte) i;
        System.out.println("Now int (i) is a byte type " + i + " to " + b + "\n");

        System.out.println("Conversion of double to int type.");
        i = (int) d;
        System.out.println("Now double (d) is an int type " + d + " to " + i);
    }
}