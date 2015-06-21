import java.util.BitSet;

/**
 * Created by OrangeUser on 6/17/2015.
 */
public class BitArray {

    private BitSet bitSet;
    private int size;

    public BitArray(){
        bitSet = new BitSet();
        size = 0;
    }

    public void add(boolean value) {
        bitSet.set(size, value);
        size++;
    }

    public int getSize(){
        return size;
    }

    public void set(boolean value , int index) {
        if (index <= size && index >= 0) {
            bitSet.set(index, value);
        }
    }

    public boolean get(int index) {
        if (index <= size && index >= 0)
            return bitSet.get(index);
        else
            throw new IndexOutOfBoundsException();
    }


}
