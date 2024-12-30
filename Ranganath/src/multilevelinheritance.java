class animal //parent
{
  public void d1(String color, String type_of_food)
  {
      System.out.println("color"+color);
      System.out.println("type_of_food"+type_of_food);
  }
}
class dog extends animal// child and parent
{
    public void d2(String name, String breed, String color)
    {
        System.out.println("name"+name);
        System.out.println("breed"+breed);
        System.out.println("color"+color);
    }
}
class babydog extends dog // child
{
    public void d3(String name, String breed, String color, String gender)
    {
        System.out.println("name"+name);
        System.out.println("color"+color);
        System.out.println("breed"+breed);
        System.out.println("gender"+gender);
    }
}
public class multilevelinheritance {
    public static void main(String[]args){
        babydog obj = new babydog();
        obj.d1("blue", "veg");
        obj.d2("jimmy", "labour","pink");
        obj.d3("tommy", "labour","black","male");
    }
}
