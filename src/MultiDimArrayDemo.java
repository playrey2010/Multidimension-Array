public class MultiDimArrayDemo {
    public static void main(String[] args) {

        int [][] rowcol = new int[10][5];

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 5; j++) {
//                rowcol[i][j] = ;
//            }
//            System.out.println("");
//
//        }
//
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("row " + i + " col " + j + " ");
//            }
//            System.out.println("");
//        }
        String [][] multTable = new String[12][12];
        // this solution does not use arrays.
//        for (int i = 1; i <=12; i++) {
//            for (int j = 1; j<=12; j++) {
//                System.out.print(i*j + "\t");
//            }
//            System.out.println("");
//        }
        //This solution does use arrays.
        for (int i = 1; i <=12; i++) {
            for (int j = 1; j<=12; j++) {
                multTable[i-1][j-1] = i*j + "\t";
                System.out.print(multTable[i-1][j-1] + "\t");
            }
            System.out.println("");
        }

    }
}
