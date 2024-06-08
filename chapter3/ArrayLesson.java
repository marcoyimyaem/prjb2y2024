package chapter3;


import java.util.*;

public class ArrayLesson {
    public static void main(String[] args) {
        int[] numbers = new  int[3];
        System.out.println(numbers[2]);
        String[] numbStrings = {"10","9","100", " "};
        Arrays.sort(numbStrings);
        for (String numbstring : numbStrings) {
            System.out.println(numbstring);
        }
        System.out.println("enter a number");
        Scanner input1 = new Scanner(System.in);
        int y = input1.nextInt();
        System.out.println(y+" multiply by zero is" + (y*0));
    }
}
