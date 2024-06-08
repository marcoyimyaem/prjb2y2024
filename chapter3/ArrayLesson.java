package chapter3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayLesson {
    public static void main(String[] args) {
        int[] numbers = new  int[3];
        System.out.println(numbers[2]);
        String[] numbStrings = {"10","9","100", " "};
        Arrays.sort(numbStrings);
        for (String numbstring : numbStrings) {
            System.out.println(numbstring);
        }
    }
}
