package chapter1;
class Plant{
    int numberOfLeaves = 32;
    String name;
}
public class Main{
    int x = 10;
    public static void main(String[] args) {
        System.out.println("Hello World");
        Main m = new Main();
        System.out.println(m.x);
        m.x=0;
        System.out.println(m.x);
        Plant p1 = new Plant();
        p1.numberOfLeaves =1;
        p1.name= "";
        System.out.println(p1.numberOfLeaves);
    }
    
}
 class MainAgain{
    public static void main(String[] args) {
        System.out.println("Hello Marco");
        
    }
}
class Enemy{
    int hp = 100;
    int attack = 40;
}
