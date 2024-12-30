class b{
private String name = "ram";
private int age = 18;
private String branch = "IT";
private int rollno = 22;

public String getName() {
    return name;
}

public int getAge() {
    return age;
}

public String getBranch() {
    return branch;
}

public int getRollno() {
    return rollno;
}
  }
public class student {
    public static void main(String[] args) {
        b x=new b();
        person obj = new person();
        System.out.println(obj.getName()+" "+obj.getAge()+" "+obj.getBranch()+" "+obj.getRollno());
    }
}
