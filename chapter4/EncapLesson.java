package chapter4;

public class EncapLesson {
    public static void main(String[] args) {
        Swan mother = new Swan(2);
        //mother.numberEggs = -100;
        System.out.println(mother.getNumberEggs());
        // mother.setNumberEggs(10);
        mother = new Swan(12);
        System.out.println(mother.getNumberEggs());
    }
    
    
}
class Swan {
    private int numberEggs; // private
    public Swan(){
        this(0);
    }
    public Swan(int eggs){
        numberEggs=eggs;
    }
    
    public int getNumberEggs() { // getter
        return numberEggs;
    }
    // public void setNumberEggs(int numberEggs) { // setter
    //     if (numberEggs >= 0) // guard condition
    //         this.numberEggs = numberEggs;
    //     else{
    //         System.out.println("invalid numberEggs");
    //         this.numberEggs =0;}
    // } 
    
    
}