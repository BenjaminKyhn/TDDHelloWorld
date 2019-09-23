public class Hello {

    public static String getHelloNavn(String navn){

        if (navn.trim().equals(""))
            return "Hello";
        else
            return "Hello " + navn.trim();
    }
}
