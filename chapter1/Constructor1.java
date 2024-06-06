package chapter1;

public class Constructor1 {
    // public Constructor2(){
        // int x;
        // x=10;
    // }
    public Constructor1(){
        System.out.println("Constructor1 is generated");
    }
    public void Constructor1(){
         }
   
}

class ConsRunner{
    int x;
    { x=10;}
    { x=22;}
    ConsRunner(){
        System.out.println(x);
    }
    public static void main(String[] args) {
        {
            System.out.println("Snow");
            int y = 10;
        }

        Constructor1 c1 = new Constructor1();
        Constructor1 c2 = new Constructor1();
        Constructor1 c3 = new Constructor1();
        Constructor1 c4;
        int x = 10;
        ConsRunner cr1 = new ConsRunner();
        c1.Constructor1();
        {
            System.out.println("Ash");
        }
    }
    { x=122;}
}

// class ParkRanger{
//     int birds = 10;
//     public static void main(String[] args) {
//         int trees = 5;
//         System.out.print(trees+birds);
//     }
// }