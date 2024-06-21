package chapter4;
import java.util.*;

public class PredicateLambda {
 static void print(List<Animal> animals, Predicate<Animal> checker){
        for(Animal animal:animals){
            if(checker.test(animal)){
                System.out.print(animal+ ", ");
            }
            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Fish", false, true,1));
        animals.add(new Animal("kangaroo", true, false,8));
        animals.add(new Animal("rabbit", true, false,2));
        animals.add(new Animal("turtle", false, true,11));
        animals.add(new Animal("frog", true, true, 2));
        
        // print(animals, new CheckIfHopper());
        print(animals, a -> a.canHop());
        // print(animals, new CheckIfSwimmer());
        print(animals, a -> a.canSwim());
        // print(animals, (Animal a) ->{ return a.canSwim();});
        print(animals, a -> a.canHop() && a.canSwim());
        print(animals, a -> a.getAge()>2);

        
    }
    
}

class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;
    private int age;
    public Animal(String speciesName, boolean hopper, boolean swimmer,int age) {
    species = speciesName;
    canHop = hopper;
    canSwim = swimmer;
    this.age = age;
    }
    public boolean canHop() { return canHop; }
    public boolean canSwim() { return canSwim; }
    public String toString() { return species; }
    public int getAge(){ return age;}
   }

interface CheckTrait {
    boolean test(Animal a);
   }
// class CheckIfHopper implements CheckTrait {
//     public boolean test(Animal a) {
//     return a.canHop();
//     }
//    }
// class CheckIfSwimmer implements CheckTrait {
//     public boolean test(Animal a) {
//     return a.canSwim();
//     }
//    }