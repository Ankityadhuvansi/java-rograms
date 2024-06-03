package Generics;

public class GenericType<T> {
    private  T t;

    GenericType(T t){
        this.t=t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
