package chapter14_rtti.pets;

import java.util.*;

/**
 * Created by HinTi on 2018/12/11.
 * Goal: 创建随机序列的宠物
 */
public abstract class PetCreator {
    private Random random = new Random(47);
    public abstract List<Class<? extends Pet>> types();

    /**
     * 创建随机一种宠物
     * @return 一个随机的宠物
     */
    public Pet randomPet(){
        int n = random.nextInt(types().size());
        try {
            return types().get(n).newInstance();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        }
    }
    public Pet[] createArray(int size){
        Pet[] result = new Pet[size];
        for(int i=0;i<size;i++){
            result[i] = randomPet();
        }
        return result;
    }
    public ArrayList<Pet> createArrayList(int size){
        ArrayList<Pet> result = new ArrayList<>();
        Collections.addAll(result,createArray(size));
        return  result;
    }
}
