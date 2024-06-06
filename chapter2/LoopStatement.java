package chapter2;

public class LoopStatement {
    public static void main(String[] args) {
        int looper = 10,looper2 = 0;
        while (looper>0) 
            System.out.println("looper value = "+(looper--));
        
        do
            System.out.println("Looper2:"+looper2++);
        while (looper2<10);
        // for loop
        for(int i = 0; i<10;i++)
            System.out.println("i = "+ i);
       // inifinite loop
         // for(;;)
        //     System.out.println("infinite loop");
        
        String colors[]  = {"black","red","green","yellow"};
        // for(datatype instance: collection){
        // body
        //}
        for(String color:colors)
            System.out.println(color);
     
    }
}
