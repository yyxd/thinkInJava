package chapter14_rtti.pets;

import chapter14_rtti.toys.ToyTest;

import java.util.HashMap;

/**
 * Created by HinTi on 2018/12/11.
 * Goal: 使用instanceof来检查ForName Creator创建了多少个Hamster
 */
public class PetCount {
    /**
     * 静态内部类
     * 静态内部类和静态方法一样，只能访问静态的成员变量和方法，不能访问非静态的方法和属性，但是普通内部类可以访问任意外部类的成员变量和方法
     * 静态内部类可以声明普通成员变量和方法，而普通内部类不能声明static成员变量和方法
     */
    static class PetCountor extends HashMap<String,Integer>{
        public void count(String type){
            Integer quantity = get(type);
            if(quantity == null)
                put(type,1);
            else
                put(type,quantity+1);
        }
    }

    public static void countPets(PetCreator creator){
        PetCountor countor = new PetCountor();
        for (Pet pet:creator.createArray(30)){
            System.out.print(pet.getClass().getSimpleName()+" ");
            if(pet instanceof Pet)
                countor.count("Pet");
            if(pet instanceof Dog)
                countor.count("Dog");
            if(pet instanceof Mutt)
                countor.count("Mutt");
            if(pet instanceof Pug)
                countor.count("Pug");
            if(pet instanceof Cat)
                countor.count("Cat");
            if(pet instanceof EgyptianMau)
                countor.count("EgyptianMau");
            if(pet instanceof Manx)
                countor.count("Manx");
            if(pet instanceof Cymric)
                countor.count("Cymric");
            if(pet instanceof Rodent)
                countor.count("Rodent");
            if(pet instanceof Rat)
                countor.count("Rat");
            if(pet instanceof Mouse)
                countor.count("Mouse");
            if(pet instanceof Hamster)
                countor.count("Hamster");
        }
        System.out.println();
        System.out.println(countor);
    }

    public static void main(String[] args) {
        countPets(new ForNameCreator());
    }
}
