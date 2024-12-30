// using abstract
/*
abstract class E{
    public abstract void add(int a,int b);
    public abstract void sub(int a,int b);
}
public class annomusclass {
    public static void main(String[] args) {
        {
            E obj=new E()
            {
                public void add(int a,int b)
                {
                    System.out.println(a+b);
                }
                public void sub(int a,int b)
                {
                    System.out.println(a-b);
                }
            };
            obj.add(5,2);
            obj.sub(9,8);
        }
    }
}*/

// using interface
/*
interface E{
    public abstract void add(int a,int b);
    public abstract void sub(int a,int b);
}
public class annomusclass {
    public static void main(String[] args) {
        {
            E obj=new E()
            {

                public void add(int a,int b)
                {
                    System.out.println(a+b);
                }
                public void sub(int a,int b)
                {
                    System.out.println(a-b);
                }
            };
            obj.add(5,2);
            obj.sub(9,8);
        }
    }
}
*/

// lamida expression
/*
interface E {
    void add(int a, int b);
}
interface F{
    void sub(int a,int b);
}
public class annomusclass {
    public static void main(String[] args) {
        {
            E obj = (int a, int b) -> System.out.println(a + b);
            F obj1 = (int a, int b) -> System.out.println(a - b);
            obj.add(5, 9);
            obj1.sub(9,8);
        }
    }}
*/
/*
//
abstract class E{
    public abstract void add(int a,int b);
}
abstract class F{
    public abstract void sub(int a,int b);
}
public class annomusclass {
    public static void main(String[] args) {
        {
            E obj =

                    (int a, int b) -> System.out.println(a + b);
            F obj1 = (int a, int b) -> System.out.println(a - b);
            obj.add(5, 9);
            obj1.sub(9,8);
        }
    }
}
*/
//
 /*
interface E
{
    int add(int a,int b);
}
public class annomusclass {
    public static void main(String[] args) {
        {
            E obj=(a,b) -> (a+b);
            int r=obj.add(5,8);
            System.out.println(r);
        }}}
  */
//
interface E
{
    int add(int a,int b);
}
public class annomusclass {
    public static void main(String[] args) {
        {
            E obj=(a,b) -> (a+b);
            int r=obj.add(5,8);
            System.out.println(r);
        }}}

