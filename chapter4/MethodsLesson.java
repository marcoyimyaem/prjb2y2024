package chapter4;
import java.util.*;
public class MethodsLesson {
    static boolean WithInternet;
    int addTwoNumbers(int a, int b){
        // int sum;
        // sum = ;
        return a+b;
        
    }
    void isConnectedToInternet(){
        // access hardware's connectivity
        WithInternet = true;
        System.out.println((WithInternet)?"your device is connected":"pls connect to a network");
        return ;
       
    }
    protected static Person getPerson(Person a){
        return a;
    }
    static String sayMyName(String name,int b){
        return "Hello "+name+" Welcome to Java NC III";
    }
    public String Walk4(int a){
        String result;
        if(a==4)
            result = "";
        else
            result = "Walk4";
        return result;
    }
    void Walk1(){}
    static float getAverage(int... grades){
        return 0;
    }
    void getGradeAverageInfo(String name,int... grades){
        System.out.println("Hello "+name+" your average grade is"+ getAverage(grades));
    }
    int getLastNumber(int y,int... numbers){
        // int x = ; numbers.length -1
        return numbers[0];
    }
    void Talk1(String name,boolean TorF,int... numbers){}
    // void Talk2(String names...,int... numbers){}
    public static void main(String[] args) {
       MethodsLesson ml = new MethodsLesson();
       System.out.println(ml.addTwoNumbers(Integer.MAX_VALUE,5)); 
       ml.isConnectedToInternet();
       System.out.println(sayMyName("sir Marco",ml.addTwoNumbers(Integer.MAX_VALUE,5)));
       Random r = new Random();
       System.out.println(r.nextInt(10));
       ml.getAverage(90,91,98,75,81);
       ml.getAverage(new int[]{90,91,98,75,81});
       System.out.println(ml.getLastNumber(11,25,68,74,33,12,100,3365,1245,2305,1));      
    }

}

class Person{
    static String Name = "bogart";
    public static void main(String[] args) {
        speak("Inday");
        System.out.println(Name);
        
    }
    static void speak(String name){
        Name = name;

    }
}