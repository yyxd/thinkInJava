package chapter14_rtti.pets;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by HinTi on 2018/12/11.
 * Goal:
 */
public class PetCount3 {
    static class PetCounter extends LinkedHashMap<Class<? extends Pet>,Integer>{
        public PetCounter(){
            super();
            for(Class<? extends Pet> cc:LiteralPetCreator.allTypes){
                put(cc,0);
            }
        }
        public void count(Pet pet){
            for(Map.Entry<Class<? extends Pet>,Integer> pair:entrySet()){
                if(pair.getKey().isInstance(pet))
                    put(pair.getKey(),pair.getValue()+1);
            }
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder("{");
            for(Map.Entry<Class<? extends Pet>,Integer> pair:entrySet()){
                result.append(pair.getKey().getSimpleName());
                result.append("=");
                result.append(pair.getValue());
                result.append(", ");
            }
            result.delete(result.length()-2,result.length());
            result.append("}");
            return result.toString();
        }
    }

    public static void main(String[] args) {
        PetCounter counter = new PetCounter();
        for(Pet pet:Pets.createArray(20)){
            System.out.print(pet.getClass().getSimpleName()+" ");
            counter.count(pet);
        }
        System.out.println();
        System.out.println(counter);
    }
}
