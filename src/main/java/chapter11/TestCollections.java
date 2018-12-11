package chapter11;

import org.junit.Test;

import java.util.*;

/**
 * Created by HinTi on 2018/11/29.
 * Goal:
 */
public class TestCollections {
    @Test
    public void TestCol()
    {
        ArrayList<String> testArrayList = new ArrayList<String>();
        LinkedList<String> testLinkedList = new LinkedList<String>();
        HashSet<String> testHashSet = new HashSet<String>();
        LinkedHashSet<String> testLinkedHashSet = new LinkedHashSet<String>();
        TreeSet<String> testTreeSet = new TreeSet<String>();
        GenerateMovies genMovies = new GenerateMovies();
        for(int i =0;i<genMovies.size();i++)
            testArrayList.add(genMovies.next());
        for(int i =0;i<genMovies.size();i++)
            testLinkedList.add(genMovies.next());
        for(int i =0;i<genMovies.size();i++)
            testHashSet.add(genMovies.next());
        for(int i =0;i<genMovies.size();i++)
            testLinkedHashSet.add(genMovies.next());
        for(int i =0;i<genMovies.size();i++)
            testTreeSet.add(genMovies.next());
        System.out.println(testArrayList);
        System.out.println(testLinkedList);
        System.out.println(testHashSet);
        System.out.println(testLinkedHashSet);
        System.out.println(testTreeSet);
    }

}
