package chapter14_rtti;
import java.util.*;
/**
 * Created by HinTi on 2018/12/10.
 * Goal: 检测使用.class是否会加载类
 */
class Initable{
    static final int staticFinal = 47;
    static  int staticFinal2 = ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Initializing Initable");
    }
}
class Initable2{
    static {
        System.out.println("Initializing Initable2");
    }
    static  int staticaNonFinal = 147;
}
class Initable3{
    static  int staticaNonFinal = 74;
    static {
        System.out.println("Initializing Initable2");
    }
}
public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) {
        Class initable = Initable.class;
        System.out.println("after creating initable ref");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);
        System.out.println("=======================================");
        System.out.println(Initable2.staticaNonFinal);
        System.out.println("=======================================");
        Class initable3 = Initable3.class;
        System.out.println("after creating initable3 ref");
        System.out.println(Initable3.staticaNonFinal);
    }
}
