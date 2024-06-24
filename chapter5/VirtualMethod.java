package chapter5;

public class VirtualMethod {
    public static void main(String[] args) {
        Birds bird = new Peacock();
        bird.displayBirdInfo();
        Birds bird2 = new Adarana();
        bird2.displayBirdInfo();
        // Peacock bird3 = new Adarana(); //error
    }
}

class Birds{
    public String getName(){
        return "unkown";
    }
    public void displayBirdInfo(){
        System.out.println("the bird name is: "+getName());
    }
}
class Peacock extends Birds{
    public String getName(){
        return "Peacock";
    }
}
class Adarana extends Birds{
    public String getName(){
        return "Adarana";
    }
}

