package OOPS.inhertence;

public class BOX {
    double l;
    double b;
    double h;
    BOX(){
        this.l=-1;
        this.b=-1;
        this.h=-1;
    }
    BOX(double l,double b,double h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    BOX(double side){
        this.l=side;
        this.b=side;
        this.h=side;
    }
    BOX(BOX box){
        this.l=box.l;
        this.b=box.b;
        this.h=box.h;
    }
    public static void main(String[] args) {
        System.out.println("Inheriting the Box class");
    }
}
