import java.security.Key;
import java.util.LinkedList;

public class myHashmap implements IntStringMap{


    public Integer n;
    private LinkedList<KeyValuePair>[] hashtable = new LinkedList[n];

    public myHashmap(LinkedList<KeyValuePair>[] hashtable, Integer n) {
        this.hashtable = hashtable;
        this.n = n;


    }




    private int hashfunction (Integer key ){

        return 0;
    }




    @Override
    public String put(Integer key, String value) {
        KeyValuePair<Integer, String> pair = new KeyValuePair<>(key, value);


        return null;
    }

    @Override
    public String get(Integer key) {
        return null;
    }

    @Override
    public String remove(Integer key) {
        return null;
    }
}