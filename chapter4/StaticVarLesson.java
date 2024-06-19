package chapter4;

public class StaticVarLesson {
    public static void main(String[] args) {
        Koala k1 = new Koala();
        Koala k2 = new Koala();
        Koala k3 = new Koala();
        k1.age = 1;
        k2.age = 2;
        k3.age = 3;
        k1.name = "k1";
        k2.name = "k2";
        k3.name = "k3";
        k1.numberOfClaws = 10;
        System.out.println(k1.toString());
        System.out.println(k2.toString());
        System.out.println(k3.toString());
        int x = 10;
        x++;
        x--;
        k1 = null;
        Koala.numberOfClaws = 99;
        System.out.println(k1.numberOfClaws);
        
        System.out.println(k2.toString());
        System.out.println(k3.toString());
    }
    
}

class Koala{
    int age;
    String name; 
    public static int numberOfClaws = 8;
    static public final int NUMBER_OF_EARS ;
    static {
        NUMBER_OF_EARS =2;
    }
    
    @Override
    public String toString(){
        // NUMBER_OF_EARS +=19;
        return name+" \tage: "+age+"\tnumber of claws:  "+numberOfClaws;
    }
}

