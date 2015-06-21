package Patterns;

/**
 * Created by OrangeUser on 6/18/2015.
 */

interface Iterator {
    boolean hasNext();
    Object getNext();

}


class NameRepository  {


    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length)
                return true;
            else
                return false;
        }

        @Override
        public Object getNext() {
            if (this.hasNext())
                return names[index++];
            return null;
        }
    }
}

public class IteratorPattern {
    public static void main(String[] args) {
        int tes;
        NameRepository repository = new NameRepository();

        for (Iterator iterator = repository.getIterator(); iterator.hasNext();) {
            System.out.println((String) iterator.getNext());
        }
    }
}
