import java.io.File;

public class AsciiCharSequence implements CharSequence /* extends/implements */ {

    // implementation
    private byte[] array;

    public AsciiCharSequence(byte[] array) {

        this.array = array.clone();
    }

    @Override
    public int length() {

        return array.length;
    }

    @Override
    public char charAt(int i) {

        return (char) array[i];
    }

    @Override
    public AsciiCharSequence subSequence(int i, int i1) {

        return new AsciiCharSequence(java.util.Arrays.copyOfRange(array, i, i1));
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        for (byte c : array) {
            s.append((char) c);
        }

        return s.toString();
    }
}