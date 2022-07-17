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

class recur {
    int values[];
    recur(int i) {
        values = new int[i];
    }
    void printArray(int i) {
        if(i == 0) {
            return;
        }
        else {
            printArray(i-1);
        }
        System.out.println("[" + (i-1) + "] " + values[i-1]);
    }
}

class recurDemo {
    public static void main(String[] args) {
        recur r = new recur(10);
        int i;
        for(i = 0; i < 10; i++) {
            r.values[i] = i;
        }
        r.printArray(10);
    }
}