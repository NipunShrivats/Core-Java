
public class Arrays {

    public static void main(String[] args) {
        // 1.
        // int[] arr1 = new int[3]; // 32 bits each
        // arr1[0] = 90;
        // System.out.print(arr1[0]);

        // 2.
        // int[] roll = new int[5];
        // int x = 101;
        // for (int i = 0; i < 5; i++) {
        //     roll[i] = x;
        //     x++;
        //     System.err.println(roll[i]);
        // }
        // 2D array
        int[][] marks = new int[3][3];

        int value = 0;
        for (int r1 = 0; r1 < marks.length; r1++) {
            for (int c1 = 0; c1 < marks.length; c1++) {
                marks[r1][c1] = value;
                value++;
            }
        }
        for (int r1 = 0; r1 < marks.length; r1++) {
            for (int c1 = 0; c1 < marks.length; c1++) {
                System.out.print(" " + marks[r1][c1]);
            }
            System.out.println();
        }

        // System.out.println("marks: " + marks);
    }
}
