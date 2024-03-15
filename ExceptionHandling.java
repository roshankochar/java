//try catch throw throws finally

/**
 * All exception types are subclasses of the built-in class Throwable. Thus, Throwable is at the
 * top of the exception class hierarchy. Immediately below Throwable are two subclasses that
 * partition exceptions into two distinct branches. One branch is headed by Exception. This
 * class is used for exceptional conditions that user programs should catch. This is also the
 * class that you will subclass to create your own custom exception types. There is an important
 * subclass of Exception, called RuntimeException. Exceptions of this type are automatically
 * defined for the programs that you write and include things such as division by zero and
 * invalid array indexing.
 * The other branch is topped by Error, which defines exceptions that are not expected to
 * be caught under normal circumstances by your program. Exceptions of type Error are used
 * by the Java run-time system to indicate errors having to do with the run-time environment,
 * itself. Stack overflow is an example of such an error.
 *
 * If and when the errors are not handled by try-catch, Java's Runtime handles it and it means
 * that the program will be exited.
 * */
public class ExceptionHandling {
    public static void main(String[] args) {
        Testing obj = new Testing();
        obj.func(Integer.parseInt(args[0]));
        System.out.println(Testing.cons);//revision : can access static members without any reference.
    }
}

class Testing{
    static int cons = 0;
    void func(int a){
        try {
//            int a = 0;
            System.out.println(10 / a);
        } catch(Throwable e){ //but the error is of type java.lang.ArithmeticException. Dynamic method Dispatch in action
            System.out.println("error " + e);
        }
    }
}