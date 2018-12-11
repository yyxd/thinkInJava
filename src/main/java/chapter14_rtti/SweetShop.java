package chapter14_rtti;

/**
 * Created by HinTi on 2018/12/10.
 * Goal: 查看类加载器的运行方式，java程序只有在必需时才加载类到JVM
 * result: 可以看出是在需要时类才被加载进来 每个类都有一个static子句，该子句在类第一次被加载时执行
 * inside main
 * Loading candy
 * After creating candy
 * Loading gum
 * After Class.forName("Gum")
 * Loading cookie
 * After creating cookie
 */
class Candy{
    static  {
        System.out.println("Loading candy");
    }
}

class Gum{
    static {
        System.out.println("Loading gum");
    }
}

class Cookie{
    static {
        System.out.println("Loading cookie");
    }
}
public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating candy");
        try {
            Class.forName("chapter14_rtti.Gum");
        }catch (ClassNotFoundException e){
            System.out.println("couldn't find gum");
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating cookie");
    }
}
