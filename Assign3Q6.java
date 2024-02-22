public class Assign3Q6 {
    public static void main(String[] args) {
        // Rectangle
        System.out.println("Rectangle:");
        int rowCountRect = 0;
        do {
            int colCountRect = 0;
            do {
                System.out.print("*");
                colCountRect++;
            } while (colCountRect < 10);
            System.out.println();
            rowCountRect++;
        } while (rowCountRect < 4);
        System.out.println();

        // Ascending Lines
        System.out.println("Ascending Lines:");
        int lineCountAsc = 1;
        do {
            int starCountAsc = 0;
            do {
                System.out.print("*");
                starCountAsc++;
            } while (starCountAsc < lineCountAsc);
            System.out.println();
            lineCountAsc++;
        } while (lineCountAsc <= 5);
        System.out.println();

        // Descending Lines
        System.out.println("Descending Lines:");
        int lineCountDesc = 5;
        do {
            int starCountDesc = 0;
            do {
                System.out.print("*");
                starCountDesc++;
            } while (starCountDesc < lineCountDesc);
            System.out.println();
            lineCountDesc--;
        } while (lineCountDesc >= 1);
        System.out.println();

        // Triangle
        System.out.println("Triangle:");
        int rowCountTri = 1;
        do {
            int colCountTri = 0;
            do {
                System.out.print("*");
                colCountTri++;
            } while (colCountTri < rowCountTri);
            System.out.println();
            rowCountTri++;
        } while (rowCountTri <= 5);
        System.out.println();

        // Numerical Triangle
        System.out.println("Numerical Triangle:");
        int rowCountNumTri = 1;
        do {
            int colCountNumTri = 1;
            do {
                System.out.print(rowCountNumTri);
                colCountNumTri++;
            } while (colCountNumTri <= rowCountNumTri);
            System.out.println();
            rowCountNumTri++;
        } while (rowCountNumTri <= 5);
        System.out.println();

        // Custom Pattern
        System.out.println("Custom Pattern:");
        int rowCountCustPattern = 1;
        do {
            int colCountCustPattern = 1;
            int numCustPattern = rowCountCustPattern;
            do {
                System.out.print(numCustPattern);
                if (colCountCustPattern < rowCountCustPattern) {
                    numCustPattern--;
                } else {
                    numCustPattern++;
                }
                colCountCustPattern++;
            } while (colCountCustPattern <= rowCountCustPattern * 2 - 1);
            System.out.println();
            rowCountCustPattern++;
        } while (rowCountCustPattern <= 5);
    }
}
