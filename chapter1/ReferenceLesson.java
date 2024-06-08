package chapter1;
class ReferenceLesson{
    // int public = 10; java reserved word
    //Valid java main() entry points public and static is reversable 
    // public static void main(String[] asdasd)
    // public static void main(String asdasd[])
    // public static void main(String... asdasd)
    // public static void main(String... _args)
    // public static void main(String... $args)
    
    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;
        String three = one;
        one = "x";
        two = "p";
        three = "a";// not same as the first obj
        one = null;
        int x = 0;
        System.out.println(args[0]);
        } 
}
