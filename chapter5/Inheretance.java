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
}
interface CanBurrow {
    int MINIMUM_DEPTH = 2;
    int getMaximumDepth();
    
}
interface CanHunt{
    int min_dmg=100;
    int getMin_dmg();
}