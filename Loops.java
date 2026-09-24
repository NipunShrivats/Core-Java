
public class Loops {

    public static void main(String[] args) {
        // Loops
        // int i = 1;
        // while (i <= 10) {
        //     System.out.println(i);
        //     i++;
        // }
        // int j = 10; 
        // while (j >= 1) {
        //     System.out.println(j);
        //     j--;
        // }

        // do {
        //     System.out.println(i);
        //     i++;
        // } while (i <= 10);
        // for
        // int i;
        // for (i = 1; i <= 10; i++) {
        //     System.out.println(i);
        // }
        // for (i = 1; i <= 10; i++) {
        //     System.out.println(i * 2);
        // }
        outer:
        for (int i = 1; i <= 5; i++) {
            inner:
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
