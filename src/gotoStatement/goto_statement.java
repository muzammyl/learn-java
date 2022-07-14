package src.gotoStatement;

class goto_statement {
    public static void main(String[] args) {
        boolean x = true;
        first: {
            second: {
                third: {
                    System.out.println("Before break;");
                    if(x) break second;
                    System.out.println("Won't execute");
                }
                System.out.println("Won't execute");
            }
            System.out.println("This is after second goto...");
        }
    }
}

class contiGoto {
    public static void main(String[] args) {
        outer: for(int i = 0; i < 10; i++) {
            for(int j  = 0; j < 10; j++) {
                if(j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }
}