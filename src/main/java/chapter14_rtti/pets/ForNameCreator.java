package chapter14_rtti.pets;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HinTi on 2018/12/11.
 * Goal:
 */
public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> petTypes = new ArrayList<>();
    private static String[] typeNames = {
            "chapter14_rtti.pets.Mutt",
            "chapter14_rtti.pets.Pug",
            "chapter14_rtti.pets.EgyptianMau",
            "chapter14_rtti.pets.Manx",
            "chapter14_rtti.pets.Cymric",
            "chapter14_rtti.pets.Rat",
            "chapter14_rtti.pets.Mouse",
            "chapter14_rtti.pets.Hamster",
    };
    private static void loader(){
       try {
           for(String name:typeNames){
               petTypes.add((Class<? extends Pet>)Class.forName(name));
           }
       } catch (ClassNotFoundException e) {
          throw new RuntimeException(e);
       }
    }
    static {
        loader();
    }
    @Override
    public List<Class<? extends Pet>> types() {
        return petTypes;
    }
}
