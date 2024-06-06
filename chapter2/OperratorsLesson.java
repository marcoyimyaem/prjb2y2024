package chapter2;

public class OperratorsLesson {
    public static void main(String... args) {
        int z = 5;
        int x = 1 + z--;
        boolean e = true;
        System.out.println(z);
        System.out.println(x);
        int y = 1+ ++z;
        System.out.println(z);
        System.out.println(y);
        System.out.println(z);
        System.out.println(-y);
        System.out.println(!e);
        System.out.println(1*4);
        System.out.println(10/2);
        System.out.println(15%2);
        System.out.println("3<<2 = "+(3>>2));
        // 0000 8421
        //
        // 0000 0011
        // 0000 1100
        System.out.println(1<2);
        System.out.println(1>2);
        System.out.println(10<=10);
        System.out.println(100>=29);
        System.out.println(z==y);
        System.out.println(z!=y);
        short a = 10;
        short b = 10;
        short c =(short) (a * b);
        int q = 2;
        long w = 3;
        int u = (q*=w); // q =(type) q * w;
        System.out.println("the result of q*=w is "+q);
        System.out.println("the result u = (q*=w) is "+u);
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;
        String three = one;
        // one = null;

        System.out.println((one instanceof String));
        System.out.println("(1<4)==(true && false) is "+ ((1<4)==(true && false)));
        System.out.println("two == three is "+(two == three));
    }
    
}
