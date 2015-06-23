/**
 * Created by OrangeUser on 6/17/2015.
 */
public class BitArray {

    private byte bitX8[] = null;

    public BitArray(int size) {
        bitX8 = new byte[size / 8 + (size % 8 == 0 ? 0 : 1)];
    }

    public boolean getBit(int pos) {
        return (bitX8[pos / 8] & (1 << (pos % 8))) != 0;
    }

    public void setBit(int pos, boolean b) {
        byte b8 = bitX8[pos / 8];
        byte posBit = (byte) (1 << (pos % 8));
        if (b) {
            b8 |= posBit;
        } else {
            b8 &= (255 - posBit);
        }
        bitX8[pos / 8] = b8;
    }

}

class TestBit {
    public static void main(String[] args) {
        BitArray array = new BitArray(5);
        array.setBit(0, true);
        array.setBit(1, false);
        array.setBit(2, true);
        array.setBit(3, false);

        System.out.println(array.getBit(0));

    }
}
