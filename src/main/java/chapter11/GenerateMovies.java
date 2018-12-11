package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by HinTi on 2018/11/29.
 * Goal:
 */
public class GenerateMovies {
    List <String> movies ;
    int index;
    GenerateMovies(String[] movieNames)
    {
       movies= new ArrayList<String>(Arrays.asList(movieNames));
       index = 0;
    }

    GenerateMovies()
    {
        String[] movieNames ={"Snow white","Titanic","The Great Gatsby","Star Wars","Iron man","Bat man"};
        movies= new ArrayList<String>(Arrays.asList(movieNames));
        index = 0;
    }
    public int size()
    {
        return movies.size();
    }

    public String  next()
    {
        if(index>=movies.size())
            index = 0;
        return movies.get(index++);
    }
}
