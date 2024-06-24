package chapter5;

public class PolyMorphicParam {
    public static void main(String[] args) {
        ZooKeeper z1 = new ZooKeeper();
        z1.feed(new Reptile());
        z1.feed(new Aligator());
        z1.feed(new Crocodile());
        z1.feed(new Snake());
        z1.feed(new Lizard());
        // level.generate(new Stage(),new Monsters(1,1,100))
        
    }
}

class Reptile{
    public String getName(){
        return getClass().getSimpleName();
    }
}
class Aligator extends Reptile{

}
class Crocodile extends Reptile{

}
class Snake extends Reptile{

}
class Lizard extends Reptile{

}

class ZooKeeper{
    public static void feed(Reptile reptile){
        System.out.println("Feeding reptile: "+ reptile.getName());
    }
}

class Mammal {
    public Mammal(int age) {
    System.out.print("Mammal");
    }
    }
class Platypus extends Mammal {
    public Platypus() {
        super(1);
        System.out.print("Platypus");
    }
    public static void main(String[] args) {
    new Mammal(5);
    }
    }