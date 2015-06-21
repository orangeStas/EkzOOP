import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by OrangeUser on 6/17/2015.
 */
public class Dictionary {

    private LinkedHashMap<String, Object> dictionary;

    public Dictionary(){
        dictionary = new LinkedHashMap<String, Object>();
    }

    public void add(String key, Object value) {
        dictionary.put(key, value);
    }

    public int getSize(){
        return dictionary.size();
    }

    public void remove(String key){
        dictionary.remove(key);
    }

    public Object searchValue(String key) {
        return dictionary.get(key);
    }

    public void clear(){
        dictionary.clear();
    }

    public void sort(){
        Map<String, Object> map = new TreeMap<String, Object>(dictionary);
        dictionary = new LinkedHashMap<String, Object>(map);
    }

    public String toString(){
        String result = "";

        for (Map.Entry entry : dictionary.entrySet()) {
            result += entry.getKey() + " - " + entry.getValue() + "\n";
        }

        return result;
    }

}
