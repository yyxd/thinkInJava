package chapter14_rtti.toys;

/**
 * Created by HinTi on 2018/12/10.
 * Goal: Testing class Class
 */
interface HasBatteries{}
interface WaterProof{}
interface Shoots{}

class Toy{

    Toy(int i){}
}
class FancyToy extends Toy
implements HasBatteries,WaterProof,Shoots{
    FancyToy(){
        super(1);
    }
}
public class ToyTest {
    static void printInfo(Class cc){
        System.out.println("class name:"+cc.getName()+" is interface ?["+cc.isInterface()+"]" );
        System.out.println("Simple name: "+cc.getSimpleName());
        System.out.println("Canonical Name: "+cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("chapter14_rtti.toys.FancyToy");
        }catch (ClassNotFoundException e){
            System.out.println("can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face :c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object object = null;
        try {
            object = up.newInstance();
        }catch (InstantiationException e){
            System.out.println("can't instantiate");
            System.exit(1);
        }catch (IllegalAccessException e){
            System.out.println("can't access");
            System.exit(1);
        }
        printInfo(object.getClass());
    }
}
