package chapter4;

public class OverloadMethods {
    public void fly(int numMiles) { System.out.println("int");}
    public void fly(short numFeet) { System.out.println("short");}
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) { }
    public void fly(short numFeet, int numMiles) throws Exception { }
    
    public static void main(String[] args) {
        OverloadMethods olm = new OverloadMethods();
        olm.fly(3);
        olm.fly((short)3);
        System.out.println(olm.fly());
    }
}

class ReferenceTypes {
    public void fly(String s) {
        System.out.print("string ");
    }
    public void fly(Object o) {
        System.out.print("object ");
    }
    public static void main(String[] args) {
        ReferenceTypes r = new ReferenceTypes();
        r.fly("test");
        r.fly(false);
        } 
    } 

class Plane {
    
    public void fly(int i) {
        System.out.print("int ");
    }
    public void fly(long l) {
        System.out.print("long ");
    }
    public static void main(String[] args) {
        Plane p = new Plane();
        p.fly(123);
        p.fly(123L);
        // System.out.println();
        // System.out.print();
    } }

    // println - () + \n
    // print - ()