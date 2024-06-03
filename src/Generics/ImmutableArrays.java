package Generics;

public class ImmutableArrays<T> {

    private final T[] arr;

    public ImmutableArrays(T[] arr) {
        this.arr = arr.clone();
    }

    public T getArr(int index) {
        return arr[index];
    }

    public int length() {
        return arr.length;
    }
}
