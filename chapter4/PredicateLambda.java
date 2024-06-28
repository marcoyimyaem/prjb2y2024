package chapter4;
import java.util.*;

public class PredicateLambda {
 static void print(List<Animal2> animal2s, Predicate<Animal2> checker){
        for(Animal2 animal2 : animal2s){
            if(checker.test(animal2)){
                System.out.print(animal2 + ", ");
            }
            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Animal2> animal2s = new ArrayList<>();
        animal2s.add(new Animal2("Fish", false, true,1));
        animal2s.add(new Animal2("kangaroo", true, false,8));
        animal2s.add(new Animal2("rabbit", true, false,2));
        animal2s.add(new Animal2("turtle", false, true,11));
        animal2s.add(new Animal2("frog", true, true, 2));
        
        // print(animals, new CheckIfHopper());
        print(animal2s, a -> a.canHop());
        // print(animals, new CheckIfSwimmer());
        print(animal2s, a -> a.canSwim());
        // print(animals, (Animal a) ->{ return a.canSwim();});
        print(animal2s, a -> a.canHop() && a.canSwim());
        print(animal2s, a -> a.getAge()>2);

        
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
    boolean test(Animal2 a);
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