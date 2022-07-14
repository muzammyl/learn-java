package src.controlStatements.whileStatements;

class doWhile_statement {
    public static void main(String[] args) throws java.io.IOException {
        char choice;
        do {
            System.out.println("Menu");
            System.out.println("1. check");
            System.out.println("2. check");
            System.out.println("3. check");
            System.out.println("4. check");
            System.out.println("5. check");
            System.out.print("Choose: ");
            choice = (char) System.in.read();
        } while(choice < '1' || choice > '5');
        System.out.println();
        switch(choice) {
            case '1':
            System.out.println("You selected 1");
            break;
            case '2':
            System.out.println("You selected 2");
            break;
            case '3':
            System.out.println("You selected 3");
            break;
            case '4':
            System.out.println("You selected 4");
            break;
            case '5':
            System.out.println("You selected 5");
            break;
        }
    }
}