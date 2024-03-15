public class Rough {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        System.out.println(System.currentTimeMillis());
        CallMe th = new CallMe();
        CallMe th2 = new CallMe();
        System.out.println(th == th.c);
        System.out.println(th);
        System.out.println(th2);

        th.t.start();
    }
    public static void test(){
        System.out.println("test");
    }
}

class CallMe implements Runnable{
    Thread t = new Thread(this, "ct");
    CallMe c = this;
    @Override
    public void run() {
        System.out.println(c);
        Rough.test();
        System.out.println(t.getName());
    }
}
