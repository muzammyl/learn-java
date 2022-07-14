package src.controlStatements.ifStatement;

//simple example of if statement
class if_statement {
    public static void main(String[] args) {
        if (1 > 0) {
            System.out.print("1 is greater than 0");
        }
    }
}

class nestedIf {
    public static void main(String[] args) {
        int month = 12;
        String season, monthName = "April";
        if(month == 12) {
            if(monthName == "April") {
                season = "Spring";
                System.out.println("Season in " + monthName + " is " + season);
            }
        }
    }
}