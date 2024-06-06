package chapter2;

public class ConditionalStatements {
    static boolean tORF(){
        return false;
    }
    public static void main(String[] args) {
        int timeOfTheDay = 2;
        int personCounter = 0;
        if(timeOfTheDay<11)
            System.out.println("Good Morning");
        else if(timeOfTheDay<18)
            System.out.println("Good Afternoon");
        else{
            System.out.println("Good Eve");
            personCounter++;
        }
        System.out.println("Welcome to Java class");     
    char grades = 90; 
        switch (grades) {
            case 'a': 
            case 'A': System.out.println("Grade A very Good"); break;
            case 'b': System.out.println("Grade B Good"); break;
            default: System.out.println("invalid char"); break;
            case 'c': System.out.println("Grade C keep up the good work"); break;
    }
    
    int load = 4;
    String msg = (load>=4) ? (load==4)?"you can only send 1 text": "True" : "False";
    System.out.println("can send text message?:"+msg);
    }
}
