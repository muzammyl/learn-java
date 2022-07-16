package src.method;

class fact {
    int factorial(int n) {
        int result;
        if(n == 1) {
            return 1;
        }
        result = factorial(n-1) * n;
        return result;
    }
}

class recursion {
    public static void main(String[] args) {
        fact f = new fact();
        System.out.println("Factorial of 3 is " + f.factorial(3));
        System.out.println("Factorial of 4 is " + f.factorial(4));
        System.out.println("Factorial of 6 is " + f.factorial(6));
        System.out.println("Factorial of 1 is " + f.factorial(1));
    }
}