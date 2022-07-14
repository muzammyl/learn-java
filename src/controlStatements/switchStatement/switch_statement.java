package src.controlStatements.switchStatement;

class switch_statement {
    public static void main(String[] args) {
        for(int i = 0; i < 7; i++) {
            switch(i) {
                case 0:
                System.out.println("value is 0");
                break;
                case 1:
                System.out.println("value is 1");
                break;
                case 2:
                System.out.println("value is 2");
                break;
                case 3:
                System.out.println("value is 3");
                break;
                default:
                System.out.println("value is greater than 3");
            }
        }
    }
}