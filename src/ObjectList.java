/**
 * Created by OrangeUser on 6/22/2015.
 */
public class ObjectList {

    private Object[] objects;
    private int countFillElements;

    public ObjectList() {
        objects = new Object[2];
    }

    public void add(Object o) {
        if (countFillElements == objects.length)
        {
            Object[] tempArr = objects;
            objects = new Object[tempArr.length + 2];
            System.arraycopy(tempArr, 0, objects, 0, tempArr.length);
        }
        objects[countFillElements] = o;
        countFillElements++;
    }

    public int indexOf(Object o) {
        for (int i = 0 ; i < objects.length; i++) {
            if (objects[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    public void insert(Object o, int pos) {
        for (int i = objects.length-2; i >= pos ; i--){
            objects[i+1] = objects[i];
        }
        objects[pos] = o;
        countFillElements++;
    }

    public void sort(){
        for (int i = 0; i < objects.length; i++){
            for (int j = 0 ; j < objects.length-1 ; j++) {
                if (objects[j].toString().compareTo(objects[j+1].toString()) < 0){
                    Object tempObj = objects[j];
                    objects[j] = objects[j+1];
                    objects[j+1] = tempObj;
                }
            }
        }
    }

    public void remove(int index) {
        for (int i = index ; i < objects.length ; i++)
            objects[i] = objects[i+1];
    }

}

class Test2 {
    public static void main(String[] args) {
        ObjectList list = new ObjectList();
        list.add(3);
        list.add(4);
        list.add(5);
        list.insert(12,2);
        list.add(6);
        System.out.println(list.indexOf(5));
    }
}
