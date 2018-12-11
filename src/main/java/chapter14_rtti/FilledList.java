package chapter14_rtti;
import java.util.*;
/**
 * Created by HinTi on 2018/12/11.
 * Goal: newInstance() 像Class添加泛型语法
 */
class CountedInteger{
    private static long counter;
    private  final long id = counter++;
    public String toString(){
        return Long.toString(id);
    }
}
public class FilledList<T> {
    private Class<T> type;

}
