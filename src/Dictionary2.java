/**
 * Created by OrangeUser on 6/22/2015.
 */

class Item {

    public Item(String key, Integer value){
        this.key = key;
        this.value = value;
    }

    String key;
    Integer value;
}

public class Dictionary2 {

    private int size;

    Item[] items = new Item[1];

    public void add(Item item) {
        items[size] = item;
        size++;
        Item[] temp = items;
        items = new Item[size+1];
        System.arraycopy(temp, 0, items, 0, temp.length);
    }

    public Integer getValue(String key) {
        for (Item item : items) {
            if (item.key.equals(key)){
                return item.value;
            }
        }
        return null;
    }

}

class TestDcit {
    public static void main(String[] args) {
        Item item = new Item("Sd", 23);
    }
}
