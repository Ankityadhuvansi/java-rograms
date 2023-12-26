package abstract_class;

abstract class Animal {
    abstract void eat();
    abstract void sleep();
}
class Lion extends Animal{

    void eat() {
        System.out.println("Eats flesh");
    }
    void sleep() {
        System.out.println("sleep At Day");
    }
}
class Tiger extends Animal{
    void eat() {
        System.out.println("eats flesh");
    }
    void sleep() {
        System.out.println("Sleeps At morning");
    }
}
class Deer extends Animal{

    @Override
    void eat() {
        System.out.println("Eats grass");
    }

    @Override
    void sleep() {
        System.out.println("Sleeps At night");
    }
}
class Call{
    public static void main(String[] args) {
        Animal obj;
        obj=new Lion();
        obj.eat();
        obj.sleep();
        Animal obj1;
        obj1=new Tiger();
        obj1.eat();
        obj1.sleep();
        Animal obj2;
        obj2=new Deer();
        obj2.eat();
        obj2.sleep();

    }
}


