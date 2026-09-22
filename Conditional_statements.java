
public class Conditional_statements {

    public static void main(String[] args) {
        // int a = 23;
        // if(a<20)
        // System.out.println("Greater!!");
        // else
        // System.out.println("Smaller!!");
        int a = 26;
        if (a % 2 == 0) {
            System.out.println("Even no.");
        }

        int i = 5;
        switch (i) {
            case 1:
                System.out.println("i is 1");
                break;
            case 2:
                System.out.println("i is 2");
                break;
            case 3:
                System.out.println("i is 3");
                break;
            case 4:
                System.out.println("i is 4");
                break;
            default:
                System.out.println("i is greater than 4");
                break;
        }
    }
}
