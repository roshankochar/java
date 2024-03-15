/*
* What is the order of constructor execution?
* First parent's constructor is executed, then child's.
* In case of super() as well, since super() is the first statement in child's constructor, it adheres to this rule.
* */

//All classes are subclass of Object class.
public class Inheritance {

    public static void main(String[] args) {
        var par = new Parent();
        var chi = new Child();

        System.out.println(par.abc);
        System.out.println(chi.abc);
        chi.abc = 20;
        System.out.println(chi.abc); //child can access parent's members
//        System.out.println(chi.testPvt); //cannot access private members of parent
        par = chi;
//        chi = par;
//        System.out.println(par.def); //parent cannot access child's members
        System.out.println(par.abc);
        Parent par2 = new Child(); //perfectly fine. but will be able to access members of only Parent class. !!!not sure what the use case is.
        par2.printText(); //printed child text. !!!don't understand why. This concept is called Dynamic method dispatch
        //which overridden method is called is defined by the type of object it is being called from.
        // since here the type of object is Child (being referred to by Parent variable), Child's method is called.
        //!!!but then why wouldn't I directly use childObj.printText? what's the point of doing all this?
        /*
        * makes sense in following scenario:
        * List<Animal> animals = new ArrayList<>();
        * animals.add(new Dog());
        * animals.add(new Cat());
        * for (Animal animal : animals) {
        *   animal.makeSound(); // Dynamic method dispatch based on actual object type
        * }
        * */

    }
}

class Parent{
    int abc = 10;
    //A class member that has been declared as private will remain private to its class. It is not
    //accessible by any code outside its class, including subclasses.
    private int testPvt = 20;
    void printText(){
        System.out.println("Parent Text");
    }

    Parent(int val){
        testPvt = val;
    }

    Parent(){
        System.out.println("Parent constructor");
    } //default constructor. without this, the child has to create a constructor matching parent's constructor.
}

//Can extend only 1 class at a time. Can have multiple level of inheritance.
class Child extends Parent{
    int def = abc; //can access parent's members
    int ghi = 20;
    int ser = super.abc; //can access private members this way.

    Child(int val){
        super(val); //this way, subclass can access parent's private members. using this functionality, we do not have to explicitly initialize parent's variables.
    }

    Child(){
        System.out.println("Child constructor");
    };

//    @Override
    void printText(){
        System.out.println("Child Text");
    }
}

//abstract classes define structure which the subclass can inherit and override according to its needs
//cannot create object of the abstract class but can create reference variables.
abstract class AbstractClass{
    abstract int area();
}