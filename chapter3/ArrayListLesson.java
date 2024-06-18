package chapter3;
import java.util.*;
public class ArrayListLesson {
    public static void main(String[] args) {
        ArrayList employee = new ArrayList();
        employee.add(new StringBuilder("Marco"));
        employee.add(21);
        employee.add(new Shape());
        employee.add("Sm Fairvew");
        ArrayList employeeCopy = new ArrayList<>(employee);
        // ((StringBuilder) employee.get(0)).append(" yim");
        // ((Shape) employee.get(2)).setSides(3);
        Object d = employee;
        // ((ArrayList) d).add(61);
        System.out.println(employee.toString());
        System.out.println(d.toString());
        List<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add("maya"); // [hawk,maya]
        birds.add("hawk"); // [hawk, maya, hawk]
        System.out.println(birds.remove("cardinal")); // prints false
        System.out.println(birds.remove("hawk")); // prints tr   
        System.out.println(birds.remove(0)); 
        birds.add("cardinal"); 
        System.out.println( birds.set(0,"love bird")+birds);
        int x= 0;
        Float wrapper = Float.valueOf("21.00");
        System.out.println(wrapper.compare(wrapper,222));
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        //[99,5,81]
        //Collections.sort(numbers); //[5, 81, 99]
        Collections.reverse(numbers); // [81,5,99] if not sorted
        Collections.shuffle(numbers);
        System.out.println(numbers);

        // [q][a][c][4]
        // img[0] q[0] : c[0][0]=a[0]
        
    }
    
}
class Shape{
    int sides;
    String color;
    public void setSides(int sides) {
        this.sides = sides;
    }
}