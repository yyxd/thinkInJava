package chapter14_rtti;
import java.lang.reflect.*;
import java.util.regex.*;
/**
 * Created by HinTi on 2018/12/16.
 * Goal: using reflection to show all the methods of a class
 */
public class ShowMethods {
    private static String usage = "usage:\n"+
            "ShowMethods qualified.class.name\n"+
            "To show all methods in class or:\n"+
            "ShowMethods qualified.class.name word\n"+
            "To search for methods involving 'word'";
    private static Pattern pattern = Pattern.compile("\\w+\\.");

    public static void main(String[] args) {
        if(args.length<1){
            System.out.println(usage);
            System.exit(0);
        }
        int lines = 0;
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] ctors = c.getConstructors();
            if(args.length==1){
                for(Method method:methods)
                    System.out.println(pattern.matcher(method.toString()).replaceAll(""));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
