public class HelloWorld {

    /*
    * Access control levels:
    * protected: will see in future
    * private: Can be access from only within the class
    * public: Can be accessed from anywhere
    *
    * Since the main method gets called from outside (by Java run-time system), it is declared as public.
    * */


    public static void main(String[] args) {
        //1D array declaration
        int array[] = new int[5];

        //2D array declaration
        int array2D[][] = new int[5][5];

        //final
        final String filePath = "file/path"; //like constant, cannot modify later
        System.out.println("Hello World!");
    }
}
