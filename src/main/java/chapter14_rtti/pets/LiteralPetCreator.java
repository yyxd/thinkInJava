package chapter14_rtti.pets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by HinTi on 2018/12/11.
 * Goal: 使用字变量 XXX.class创建
 */
public class LiteralPetCreator extends PetCreator{

    public static final List<Class<? extends Pet>> allTypes = Collections.unmodifiableList(Arrays.asList(Pet.class,Dog.class,Pug.class,Mutt.class,Cat.class,EgyptianMau.class,Manx.class,Cymric.class,Rodent.class,Rat.class,Mouse.class,Hamster.class));
    private static final List<Class<? extends Pet>> petTypes = allTypes.subList(allTypes.indexOf(Mutt.class),allTypes.size());
    @Override
    public List<Class<? extends Pet>> types() {
        return petTypes;
    }

    public static void main(String[] args) {
        PetCreator creator = new LiteralPetCreator();
        PetCount.countPets(creator);
    }
}
