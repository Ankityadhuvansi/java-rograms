package Generics;

public class Main {
    public static void main(String[] args) {
        GenericType<Integer> G1=new GenericType<>(10);
        GenericType<String>  G2 =new GenericType<>("abc");
        var obj1 =new GenericType<Integer>(1078);

        System.out.println(G1.getT());
        System.out.println(obj1.getT());

        System.out.println("// Immutable Arrays:\n");

        var stringArray = new ImmutableArrays<>(new String[]{"abf","kdjka","jdak","jkjanckj","ejinfjsn"});

        for (int i = 0; i < stringArray.length(); i++) {
            System.out.println(stringArray.getArr(i));
        }

        var doubleArray = new ImmutableArrays<>(new Double[] {1.03, 2.04});

//        MyClass obj1 = ..., obj2 =; ...; // suppose, you have two
//        objects of your custom class

//        var array = new ImmutableArrays<>(new  MyClass[]{obj1, obj2});
    }
}
