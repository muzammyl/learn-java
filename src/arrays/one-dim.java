package src.arrays;

class onedim {
    public static void main(String[] args) {
        int weekDays[] = new int[7];
        weekDays[0] = 1;
        weekDays[1] = 2;
        weekDays[2] = 3;
        weekDays[3] = 4;
        weekDays[4] = 5;
        weekDays[5] = 6;
        weekDays[6] = 7;
        System.out.println("Tuesday is Day " + weekDays[2] + " of the week.");
    }
}

class onedim1 {
    public static void main(String[] args) {
        int weekDays[] = { 1, 2, 3, 4, 5, 6, 7};
        System.out.println("Tuesday is Day " + weekDays[2] + " of the week.");
    }
}