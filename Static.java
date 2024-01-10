
    /*
     * static
     *
     * When the requirement is such that you need a member that is independent of the object declaration of the class.
     * All the objects will be referring to the 1 copy of the member.
     * main() is static because it needs to be called before any object initialization.
     * */

public class Static {

    static int a = 1;
    static int b = 10;
    public static void main(String[] args) {
        Static obj = new Static();
        System.out.println(obj.a);
        Static newObj = new Static();
        obj.a = 5;
        System.out.println(newObj.a);
        System.out.println(Static.a); //Can be accessed like this. Probably main method is called similarly internally

    }
}
