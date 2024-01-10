public class NestedClass {
    public static void main(String[] args) {
        Outside out = new Outside();
        out.func();

//        Inside in = new Inside(); // Cannot directly access the child class outside the parent. Only parent can do so.
    }
}

class Outside{
    private int a = 10;
    int b = 20;
//    int c = in_a;   //Cannot access child class' members.
    void func(){
        Inside in = new Inside();
        System.out.println(in.in_a); // now we can access
        in.func();
    }
    class Inside{
        int in_a = 5;
        void func(){
            System.out.println("Can access variables of parent class - " + a + ' ' + b);
        }
    }
}
