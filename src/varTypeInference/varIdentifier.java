package src.varTypeInference;

class varIdentifier {
    public static void main(String[] args) {
        int var, a;
        var = 67;
        a = var + 3;
        System.out.println("Value of var is " + var);
        System.out.println("After addition var is now " + a);
    }
}