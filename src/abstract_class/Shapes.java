package abstract_class;
 abstract class shape {
     abstract void calc_area();
     abstract void display_area();
}
abstract class twodimensionalShape extends shape{
    abstract void position(int x, int y);

}
abstract class threedimensionalShape extends shape{
    abstract void position(int x, int y, int z);
 }
class rectangle extends twodimensionalShape{

    @Override
    void calc_area() {

    }

    @Override
    void display_area() {

    }

    @Override
    void position(int x, int y) {

    }
}
class sphere extends threedimensionalShape{

    @Override
    void calc_area() {

    }

    @Override
    void display_area() {

    }

    @Override
    void position(int x, int y, int z) {

    }
}
class main{
    public static void main(String[] args) {
        shape obj;
        obj =new rectangle();
        obj.calc_area();
        obj.display_area();
        shape obj1;
        obj1=new sphere();
        obj1.display_area();
        obj1.calc_area();
    }
}
