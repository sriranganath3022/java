// abstract hiding the internal features , object cant created, created only using inheritance
/*
abstract class shape // class
{
    abstract void draw(); // method
}
class circle extends shape{
    void draw()
    {
        System.out.println("drawing a circle");
    }
}
public class Abstraction
{
    public static void main(String[] args)
    {
        circle obj=new circle();
        obj.draw();
    }
}*/

// using arithmetic

/*
abstract class arithmetic  // class
{
    abstract void add(int a, int b); // method
    abstract void sub(int a, int b); // method
    abstract void mul(int a, int b); // method
    abstract void div(int a, int b); // method
}
class arithmetic_operators extends arithmetic{
    void add(int a, int b)
    {
        System.out.println(a+b);
    }

    @Override
    void sub(int a, int b) {
            System.out.println(a-b);
    }

    @Override
    void mul(int a,int b) {
              System.out.println(a*b);
    }

    @Override
    void div(int a,int b) {
               System.out.println(a/b);
    }
}
public class Abstraction
{
    public static void main(String[] args)
    {
        arithmetic_operators obj=new arithmetic_operators();
        obj.add(1,2);
        obj.sub(3,5);
        obj.mul(4,6);
        obj.div(8,9);
    }
}  */

//
 /*
abstract class abc
{
    abstract void office_work_details(int id , int login_hrs);
}
class def extends abc
{
    void officeworkdetails(int id , int login_hrs)
    {
            System.out.println("work details");
    }
    def (String name, int age)
    {
             System.out.println("name"+name);
             System.out.println("age"+age);
    }

    @Override
    void office_work_details(int id, int login_hrs) {

    }
}
public class Abstraction{
    public static void main(String[] args)   {
        def obj = new def("ram", 23);
        obj.officeworkdetails(52,6);
    }

}      */