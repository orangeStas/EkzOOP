/**
 * Created by OrangeUser on 6/21/2015.
 */
public class CircularBuffer {
    private Byte[] buffer;

    private int readerPos;

    private int writerPos;

    public CircularBuffer(int n) {
        buffer =  new Byte[n];
        readerPos = 0;
        writerPos = 0;
    }

    public int getSize(){
        return buffer.length;
    }

    public void write(Byte toAdd) {
        buffer[writerPos++] = toAdd;
        writerPos = writerPos % buffer.length;
    }

    public Byte read() {
        Byte value = null;
        try {
            value = buffer[readerPos++];
            buffer[readerPos-1] = null;
        } catch (Exception e){
            e.printStackTrace();
        }
        readerPos = readerPos % buffer.length;
        return value;
    }
}

class TestBuff {
    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);

        buffer.write(new Byte("1"));
        buffer.write(new Byte("2"));
        buffer.write(new Byte("3"));
        buffer.write(new Byte("4"));
        buffer.read();
        buffer.read();
        buffer.write(new Byte("5"));
    }
}
