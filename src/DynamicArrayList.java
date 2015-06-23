import java.util.*;

/**
 * Created by OrangeUser on 6/17/2015.
 */
public class DynamicArrayList {

    private List<Object> list;

    public DynamicArrayList(){
        list = new ArrayList<Object>();
    }

    public void addElement(Object object) {
        list.add(object);
    }

    public void insertElement(int index, Object object) {
        list.add(index, object);
    }

    public Object getObject(int index) {
        if (index < list.size())
            return list.get(index);
        throw new IndexOutOfBoundsException();
    }

    public int getSize() {
        return list.size();
    }

    public void removeElement(int index) {
        if (index < list.size())
            list.remove(index);
    }

    public int getIndexElement(Object object) {
        return list.indexOf(object);
    }

    public void copyTo(DynamicArrayList resultList){
        if (list != null)
            resultList.list = list;
    }

    public void sort(){
        Object[] array = list.toArray();
        Arrays.sort(array);
        list = new ArrayList<Object>(Arrays.asList(array));
    }
}

class Test {
    public static void main(String[] args) {
        DynamicArrayList arrayList = new DynamicArrayList();
        arrayList.addElement("hello");
        arrayList.addElement("asd");
        arrayList.addElement("waf");

        for (int i = 0; i < arrayList.getSize(); i++) {
            System.out.println(arrayList.getObject(i).toString());
        }

        arrayList.sort();

        DynamicArrayList list = new DynamicArrayList();
        arrayList.copyTo(list);

        for (int i = 0; i < arrayList.getSize(); i++) {
            System.out.println(arrayList.getObject(i).toString());
        }
    }
}

