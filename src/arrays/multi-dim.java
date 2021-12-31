package src.arrays;

class twoDim {
    public static void main(String[] args) {
        int twoD[][] = new int[4][5];
        int i, j ,k = 0;

        for(i = 0; i < 4; i++) {
            for(j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }

        for(i = 0; i < 4; i++) {
            for(j  = 0; j < 5; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class threeDim {
    public static void main(String[] args) {
        int threeD[][][] = new int[4][5][6];
        int i, j, k;

        for(i = 0; i < 4; i++) {
            for(j = 0; j < 5; j++) {
                for(k = 0; k < 6; k++) {
                    threeD[i][j][k] = i * j * k;
                }
            }
        }
        for(i = 0; i < 4; i++) {
            for(j = 0; j < 5; j++) {
                for(k = 0; k < 6; k++) {
                    System.out.print(threeD[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}