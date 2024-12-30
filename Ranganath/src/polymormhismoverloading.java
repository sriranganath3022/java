// method overloading


/*class overload
{
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
}
public class polymormhismoverloading {
    public static void main(String[]args){
        overload obj1=new overload();
        obj1.add(5,2);
        obj1.add(5,2,6);

    }
}
*/

// construtor overloading

/*
class overload
{
    overload(int a,int b)
    {
        System.out.println(a+b);
    }
    overload(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
}
public class polymormhismoverloading {
    public static void main(String[]args){
        overload obj1=new overload(5,6);
        overload obj2=new overload(5,6,9);
    }
}
*/

// run time polymorphism (overriding)
/*
class parent {
    public void mobile() {
        System.out.println("Samsung");
    }
}

class child extends parent {
    public void mobile() {
        System.out.println("i phone");
    }
}
public class polymormhismoverloading {
    public static void main(String[] args) {
        child obj = new child();
        obj.mobile();

    }
}*/

// using constructor


