package chapter6;

public class ExceptionLesson {
    static int tryMe(){
        try{
            System.exit(0);
        }
        catch(Exception e){
            
        }
        finally{
            
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] i = {1,2,3};
        tryMe();
        try {
            System.out.println(i[2]);
        }
        //     // throw new Exception("OMG");
        // // } catch (Exception e) {
        // //     System.out.println(e.getMessage());
        // // }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getLocalizedMessage());
        }
        finally{
            System.out.println("finally!");
        }
    System.out.println("exit");
    }
    
}
