/**
 * Created by OrangeUser on 6/17/2015.
 */
public class Stack {

    private Byte[] bytes;
    private int size;

    public Stack(int size) {
        bytes = new Byte[size];
    }

    public void push(Byte value) {
        bytes[size++] = value;
    }

    public Byte pop(){
        return bytes[size--];
    }

    public void pushValues(Byte[] values) {
        for (Byte value : values) {
            bytes[size++] = value;
        }
    }

    public Byte[] popValues(int length){
        Byte[] returnedBytes = new Byte[length];
        for (int i = 0; i < length ; i++ ) {
            returnedBytes[i] = bytes[size--];
        }
        return  returnedBytes;
    }



}
