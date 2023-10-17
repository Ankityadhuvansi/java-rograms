package OOPS.inhertence;

public class boxweight extends BOX{
    double weight;
    boxweight(){
        this.weight=-1;
    }
    boxweight(double l,double b,double h,double weight){
        super(l,b,h);
        this.weight=weight;
    }
}
