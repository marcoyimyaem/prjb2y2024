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
LOOP_FOR_COLORS:        for(String color:colors)
            System.out.println(color);
     
    
OUTER_LOOP:    for(int i = 1;i<=5;i++){
INNER_LOOP:        for(int j = 1;j<=5;j++){
IF_BREAKER:                        if(i+j==7){
                            // break OUTER_LOOP;
                            continue INNER_LOOP;
                            
                        }
                        System.out.println("i ="+i+"\tj = "+j+"\ti+j="+(i+j));
            }
        }
    }
}