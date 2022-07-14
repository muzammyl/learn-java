package src.controlStatements.whileStatements;

class while_statement {
    public static void main(String[] args) {
        int i = 100, j = 200;
        while(++i < --j);
        System.out.println("Midpoint is " + i);
    }
}