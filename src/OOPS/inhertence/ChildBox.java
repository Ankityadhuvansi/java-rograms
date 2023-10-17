package OOPS.inhertence;

public class ChildBox extends BOX {
    public static void main(String[] args) {
//        BOX box=new BOX(4,6,7);
//        System.out.println("box length: "+box.l+" box breadth: "+box.b+" box height: "+box.h);
        boxweight box1=new boxweight(1,4,4,56);
        boxweight boxweight=new boxweight();
        System.out.println("box length: "+boxweight.l+" box breadth: "+boxweight.b+" box height: "+boxweight.h+" box weight: "+boxweight.weight);
    }

}
