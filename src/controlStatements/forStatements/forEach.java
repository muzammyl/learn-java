package src.controlStatements.forStatements;

class forEach {
    public static void main(String[] args) {
        int sum = 0;
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int x: num) {
            System.out.println("Value is: " + num);
            sum += x;
            if(x == 5) break;
        }
        System.out.println("Summation of 1st five elements: " + sum);
    }
}

class search {
    public static void main(String[] args) {
        int nums[] = {4, 6, 9, 1, 5, 3, 8};
        int val = 2;
        boolean found = false;
        for(int x: nums) {
            if(x == val) {
                found = true;
                break;
            }
        }
        if(found) {
            System.out.println("Value found!");
        }
        else {
            System.out.println("Value not found!");
        }
    }
}