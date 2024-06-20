package chapter4;

public class ConstructorLesson {
    public static void main(String[] args) {
        Bunny bunny1 = new Bunny();
        Bunny bunny2 = new Bunny("White",3,1);
        System.out.println(bunny1.color);
        System.out.println(bunny2.color);
    }
    
}

class Bunny{
    String color;
    int height;
    int length;
    public Bunny(){
        this("Blue",1,1);
        System.out.println("Bunny constructor called");  

    }
    public Bunny(String color){
        this(color, 1, 1);
    }

    public Bunny(String color,int height,int length){
        this.color = color;
        this.height = height;
        this.length = length;
    }
}