
    interface student{
        int age=0;
        String name="";
        void print();
    }

    class getdetail implements student{
    int age=10;
    String name = "Rohan";
        @Override
        public void print() {
            System.out.println("age: "+age+" name: "+name);
        }
    }

    public class interfacePra
    {
        public static void main(String[] arg)
        {
            getdetail obj = new getdetail();
            obj.print();
        }
    }

