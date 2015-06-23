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
        return bytes[--size];
    }

    public void pushValues(Byte[] values) {
        for (Byte value : values) {
            bytes[size++] = value;
        }
    }

    public Byte[] popValues(int length){
        Byte[] returnedBytes = new Byte[length];
        for (int i = 0; i < length ; i++ ) {
            returnedBytes[i] = bytes[--size];
        }
        return  returnedBytes;
    }

}

class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(new Byte("12"));
        stack.push(new Byte("2"));
        stack.push(new Byte("5"));

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
