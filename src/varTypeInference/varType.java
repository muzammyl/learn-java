package src.varTypeInference;

class varType {
    public static void main(String[] args) {
        double i, j;
        i = 3.14;
        j = 7.94;
        var avg = (i + j) / 2; //var will auto suggest the type

        System.out.println("Average value: " + avg);
    }
}