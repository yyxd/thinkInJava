package chapter14_rtti.pets;

import java.util.ArrayList;

/**
 * Created by HinTi on 2018/12/11.
 * Goal:
 */
public class Pets {
    public static final PetCreator creator = new LiteralPetCreator();
    public static Pet randomPet(){
        return creator.randomPet();
    }
    public static Pet[] createArray(int size){
        return creator.createArray(size);
    }

    public static ArrayList<Pet> createArrayList(int size){
        return creator.createArrayList(size);
    }
}
