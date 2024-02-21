package WEB_TECH_LAB;

public class Instance_var {
    int Stu_id=18;
    String name="Adarsh";
    Instance_var(int Stu_id,String name){
        this.name=name;
        this.Stu_id=Stu_id;
    }
    void display(){
        System.out.println("Stident Id : "+Stu_id);
        System.out.println("student Name: "+name);

    }
    public static void main(String[] args) {
        Instance_var instanceVar=new Instance_var(12,"Ankit");
        instanceVar.display();
    }
}
