import java.util.Arrays;

public class DynamicArray<T> {

    private T[] arr;
    private int count;
    private static final int START_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public DynamicArray() {
        this.arr = (T[]) new Object[START_CAPACITY];
        this.count = 0;
    }

    public void add(T item) {
        if (count == arr.length) {
            resize();
        }
        arr[count++] = item;
    }

    public T get(int idx) {
        check(idx);
        return arr[idx];
    }

    public T remove(int idx) {
        check(idx);
        T removed = arr[idx];
        int shift = count - idx - 1;
        if (shift > 0) {
            System.arraycopy(arr, idx + 1, arr, idx, shift);
        }
        arr[--count] = null;
        return removed;
    }

    public int size() {
        return count;
    }

    private void resize() {
        int newCap = (arr.length == 0) ? START_CAPACITY : arr.length * 2;
        arr = Arrays.copyOf(arr, newCap);
    }

    private void check(int idx) {
        if (idx < 0 || idx >= count) {
            throw new IndexOutOfBoundsException("Index: " + idx + ", Size: " + count);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(arr, count));
    }

    public static void main(String[] args) {
        DynamicArray<String> da = new DynamicArray<>();
        da.add("x");
        da.add("y");
        da.add("z");
        System.out.println(da);
        System.out.println(da.get(1));
        da.remove(1);
        System.out.println(da);
        System.out.println(da.size());
    }
}
