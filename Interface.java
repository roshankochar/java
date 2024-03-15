//like abstract classes, defines structure.
//a class can implement multiple interfaces unlike inheriting multiple classes.
//interfaces can be nested and can be a member of a class as well and can be extended by other interfaces

interface TestInterface{
    public void aRandomFunction();

    //can have constants as well. cannot update them. they act as final.
    double pi = 3.14;
    String name = "Roshan";

    static void staticMethod(){
        System.out.println("static method in interface");
    }
}

//class implementing an interface must define all the methods inside the interface or should be declared abstract.
class ClassInterface implements TestInterface{
    public void aRandomFunction(){
        System.out.println("Random function");
    }
}

public class Interface{
    public static void main(String[] args) {
        //similar to what we can do with classes.
        TestInterface obj = new ClassInterface();
        //since all classes are inherited from Object class.
        Object objTest = new Interface();

        //using static method; doesn't need an instance of the class.
        TestInterface.staticMethod();
    }
}


