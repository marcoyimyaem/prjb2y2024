package chapter4;

import java.util.*;

public class LambdaLesson {
    static void print(List<Animal> animals, CheckTrait check){
        for(Animal animal:animals){
            if(check.test(animal)){
                System.out.print(animal+ ", ");
            }
            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
        animals.add(new Animal("frog", true, true));
        
        // print(animals, new CheckIfHopper());
        print(animals, a -> a.canHop());
        // print(animals, new CheckIfSwimmer());
        print(animals, a -> a.canSwim());
        print(animals, a -> a.canHop() && a.canSwim());

        
    }
    
}

class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;
    public Animal(String speciesName, boolean hopper, boolean swimmer) {
    species = speciesName;
    canHop = hopper;
    canSwim = swimmer;
    }
    public boolean canHop() { return canHop; }
    public boolean canSwim() { return canSwim; }
    public String toString() { return species; }
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