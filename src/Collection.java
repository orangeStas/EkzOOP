import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by OrangeUser on 6/21/2015.
 */

class CollectionItem {
    private Collection parent;

    public void setParent(Collection collection) {
        this.parent = collection;
    }

    public Collection getParent() {
        return parent;
    }
}

public class Collection {

    private List<CollectionItem> list;

    public Collection(){
        list = new ArrayList<CollectionItem>();
    }

    public void add(CollectionItem item) {
        item.setParent(this);
        list.add(item);
    }

    public int getSize() {
        return list.size();
    }

    private boolean checkIndex(int index) {
        return index >= 0 && index < list.size();
    }

    public void insert(CollectionItem item, int index) {
        if (checkIndex(index)){
            item.setParent(this);
            list.add(index,item);
        }
        else
            throw new IndexOutOfBoundsException();
    }

    public int getIndexElement(CollectionItem item) {
        return list.indexOf(item);
    }

    public CollectionItem getItem(int index) {
        return list.get(index);
    }

    public void copyTo(Collection collection) {

        for (CollectionItem item : list) {
            collection.add(item);
        }
    }

    public void sort() {
        CollectionItem[] array = (CollectionItem[]) list.toArray();
        Arrays.sort(array);
        list = Arrays.asList(array);
    }

    public void remove(int index) {
        if (checkIndex(index)) {
            list.remove(index);
        }
        else
            throw new IndexOutOfBoundsException();
    }

    public void replace(CollectionItem item, int index) {
        if (checkIndex(index)){
            list.set(index, item);
            item.setParent(this);
        }
        else
            throw new IndexOutOfBoundsException();
    }

}

class Testdollect {
    public static void main(String[] args) {
        Collection collection = new Collection();
        collection.add(new CollectionItem());
        collection.add(new CollectionItem());
        collection.add(new CollectionItem());
        collection.add(new CollectionItem());

        Collection collection1 = new Collection();
        collection.copyTo(collection1);

        System.out.println("resad");
    }
}
