import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by OrangeUser on 6/17/2015.
 */
public class DynamicListPattern<T> {

    private List<T> list;

    public DynamicListPattern(){
        list = new ArrayList<T>();
    }

    public void addElement(T t) {
        list.add(t);
    }

    public void insertElement(int index, T t) {
        list.set(index, t);
    }

    public T getObject(int index) {
        return list.get(index);
    }

    public int getSize() {
        return list.size();
    }

    public void removeElement(int index) {
        list.remove(index);
    }

    public int getIndexElement(T t) {
        return list.indexOf(t);
    }

    public void sort(){
        T[] array = (T[]) list.toArray();
        Arrays.sort(array);
        list = new ArrayList<T>(Arrays.asList(array));
    }

    public static void main(String[] args) {
        DynamicArrayList arrayList = new DynamicArrayList();
        arrayList.addElement(13);
        arrayList.addElement(2);
        arrayList.addElement(14);

        for (int i = 0; i < arrayList.getSize(); i++) {
            System.out.println(arrayList.getObject(i).toString());
        }

        arrayList.sort();

        for (int i = 0; i < arrayList.getSize(); i++) {
            System.out.println(arrayList.getObject(i).toString());
        }
    }

}
