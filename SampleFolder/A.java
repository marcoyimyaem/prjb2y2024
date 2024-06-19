package SampleFolder;

import chapter4.MethodsLesson;

class M{
    private int x;
    private void sendCash(){

    }
    
}
public class A{
    public String msg = "message from class A";
    static public  void main(String[] marco) {
        M m = new M();
        A a = new A();
        a.main(new int[]{1,2,3,4,5,6,7});
        // m.sendCash(100000,0210654561);
    }
    // int y = m.x;
    public static void main(int[] args) {
        System.out.println("Hello PSVM");
    }
}
class B extends MethodsLesson{
    public static void main(String[] args) {
        System.out.println("Hello Marco");
        MethodsLesson ml = new MethodsLesson();
        // ml.Walk1();
        ml.Walk4(3);
        getPerson(null);
    }
}

class Swaper{
    public static void main(String[] args) {
    Object original1 = new Object();
    Object original2 =  new Object();
    original1 = 1;
    original2 = 20;
    
    swap(original1, original2);
    System.out.println(original1); // 1
    System.out.println(original2); // 2
}
public static void swap(Object a, Object b) {
 Object temp = a;
 a = b;
 b = temp;
}
}




