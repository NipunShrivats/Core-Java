public class Operators {
        public static void main(String[] args){

            // Operators
            
            // Arithmetic Operators
            int a = 5;
            int b = 10;
            
            int c = a+b;
            int d = a-b;

            int h = a+2;
            h = h+2;
            h+=2;

            // pre increment and post increment
            h++;
            ++h;
            
            int t1 = h++; // first assign then apply the value
            int t2 = ++h;
            System.out.println("h: "  + h);
            System.out.println("t1: "  + t1);
            System.out.println("t2: "  + t2);

            // Relational Operators // true //false
            int a1 = 5;
            int b1 = 10;
            a1=b1;
            System.out.println("a1==b1:"+ (a1==b1));
 
        }
    }
