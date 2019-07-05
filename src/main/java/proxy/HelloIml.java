package proxy;

/**
 * Created by Diane on 2019-07-05.
 * Goal:
 */
public class HelloIml implements Hello,AntherInterface{
    @Override
    public void saySth(String name) {
        System.out.println("My name is, "+name);
    }

    @Override
    public void say(String name) {
        System.out.println("Hello, "+name);
    }

    public void sayMySchool(String school){
        System.out.println("I come from "+school);
    }

    @Override
    public void another(String another) {
        System.out.println("This is another, "+another);
    }
}
