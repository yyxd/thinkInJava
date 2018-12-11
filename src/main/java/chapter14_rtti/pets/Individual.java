package chapter14_rtti.pets;

/**
 * Created by HinTi on 2018/12/11.
 * Goal:
 */
public class Individual {
    private String name;
    public Individual(String name){
        this.name = name;
    }
    public Individual(){

    }
    public String toString(){
        return "name is "+name;
    }
}
