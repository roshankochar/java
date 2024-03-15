public class StringTesting {
    public static void main(String[] args) {
        String test = "testing str";
        System.out.println(test);
        test = "new test";
        System.out.println(test);
        for(int i = 0; i < args.length; i++)
            System.out.println(args[i]);

        Outside out = new Outside();
        var out2 = new Outside(); //like auto in C++
    }

    //you can send variable number of arguments to these type of functions
    void variableArguments(int ...varArgs){
        for(int i = 0; i < varArgs.length; i++)
            System.out.println(varArgs[i]);
    }

}
