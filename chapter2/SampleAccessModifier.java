package chapter2;


import SampleFolder.A;
import chapter1.*;

// import chapter1.B; //error

public class SampleAccessModifier {
    public static void main(String[] args) {
        // B b = new B(); //error
        A a = new A();
    }
}
