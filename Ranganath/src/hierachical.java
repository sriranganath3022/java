// single parent for both child
/*class A
{
    public void a1()
    {
        System.out.println("parent class");
    }
}
class B extends A
{
    public void a2()
    {
        System.out.println("child1 class");
    }
}
class C extends A
{
    public void a3()
    {
        System.out.println("child2 class");
    }
}
public class hierachical {
    public static void main(String[]args){
        B obj=new B();
        C obj1=new C();
        obj.a1();
        obj.a2();
        obj1.a1();
        obj1.a3();

    }
}

class food
{
    public void a1(String type_of_food, String name, int rating)
    {
        System.out.println("type_of_food"+type_of_food);
        System.out.println("name"+name);
        System.out.println("rating"+rating);
    }
}
class f1 extends food
{
    public void a2(String name, int price, String quantity)
    {
        System.out.println("name"+name);
        System.out.println("price"+price);
        System.out.println("quantity"+quantity);
    }
}
class f2 extends food
{
    public void a3(String name, int price, String quantity)
    {
        System.out.println("name"+name);
        System.out.println("price"+price);
        System.out.println("quantity"+quantity);
    }
}
public class hierachical {
    public static void main(String[]args){
        f1 obj=new f1();
        f2 obj1=new f2();
        obj.a1("veg", "parotta", " 5 ");
        obj.a2("nonveg","50","three");
        obj1.a1("veg","briyani","5");

    }
}*/