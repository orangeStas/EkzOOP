/**
 * Created by OrangeUser on 6/17/2015.
 */
public class Main {

    public static void main(String[] args) {

        DynamicArrayList arrayList = new DynamicArrayList();

        arrayList.addElement(new Object());
        //arrayList.insertElement(3, new Object());

        LinkedList linkedList = new LinkedList();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3", 1);
        linkedList.add("23");
        linkedList.remove(1);
        linkedList.replace("22", 2);
        System.out.println(linkedList.toString());

        Dictionary dictionary = new Dictionary();
        dictionary.add("b", "1");
        dictionary.add("c", "2");
        dictionary.add("a", "1");
        System.out.println(dictionary.toString());
        dictionary.sort();
        System.out.println(dictionary.toString());


    }

}
