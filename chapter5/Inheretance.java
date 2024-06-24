 package chapter5;

public class Inheretance {
    public static void main(String[] args) {
        Lion simba = new Lion("Simba",16);
        System.out.println(simba.getName());
              
    }
    
}
final class Hayop{}


class Animal{
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
class Lion extends Animal{
    public Lion(String name, int age) {
        super(name, age);
        
    }

    int numClaws=8;
}
abstract class Sample{
    void run(){}
    abstract int getMiles(int x);
    abstract int getMiles();
}

abstract class Sample2 extends Sample{
    abstract void swim();
    int getMiles(int x){
        return 200;
    }
}
class Aso extends Sample2 implements CanBurrow,CanHunt{
    

    @Override
    void swim() {}

    @Override
    int getMiles() {
        return 0;
        }

    @Override
    public int getMaximumDepth() {
        return MINIMUM_DEPTH+100;}

    @Override
    public int getMin_dmg() {
        return min_dmg;
    }
    public static void main(String[] args) {
        CanHunt.msg();
    }
}
interface CanBurrow {
    int MINIMUM_DEPTH = 2;
    int getMaximumDepth();
    
}
interface CanHunt{
    int min_dmg=100;
    int getMin_dmg();
    public  default float getTemp(){
        return 30;
    }
    static String msg(){
        return "";
    }
}
abstract class Primate{
    String name;
    void setName(String name){
        this.name = name;
    }
    Primate(String name){
        this.name = name;
    }
    abstract boolean hasHair();
}
interface HasTail{
    boolean isTailStriped();
}

class Lemur extends Primate implements HasTail{
    Lemur(String name) {
        super(name);
        
    }
    int age = 10;
    @Override
    public boolean isTailStriped() {
        return true;}

    @Override
    boolean hasHair() {
        return true;}
    public static void main(String[] args) {
        Lemur lemur = new Lemur("Marco");
        System.out.println(lemur.hasHair());
        System.out.println(lemur.isTailStriped());
        Primate primate = lemur;
        System.out.println(primate.hasHair());
        // System.out.println(primate.isTailStriped());
        HasTail hasTail = lemur;
        // System.out.println(hasTail.hasHair());
        System.out.println(hasTail.isTailStriped());
        // System.out.println(primate.age);
        // System.out.println(hasTail.age);
        // Lemur lemur2 = primate; //error
        Lemur lemur3 = (Lemur)primate;
        System.out.println(lemur3.age);
    }
    }
    