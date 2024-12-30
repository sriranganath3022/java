import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int a = sc.nextInt();
        System.out.println("Enter b value:");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println(c);*/
//string and integer
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name:");
        String name=sc.nextLine();
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        System.out.println(name+" "+age);*/
//
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter a firstname:");
        String firstname=sc.nextLine();
        System.out.println("Enter a lastname:");
        String lastname=sc.nextLine();
        System.out.println("Enter a collegename:");
        String collegename=sc.nextLine();
        System.out.println("Enter a branch:");
        String branch=sc.nextLine();
        System.out.println("Enter a mobileno:");
        String mobileno=sc.nextLine();
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        System.out.println(firstname+" "+lastname+" "+collegename+" "+branch+" "+mobileno+" "+age);*/
//
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter a age:");
        int age= sc.nextInt();
        if (age>=18)
        {
            System.out.println("Eligible for vote");
        }
        else;
        {
            System.out.println(" Better luck next tym");
        }*/
//if else

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        if (number%2 == 0) {
            System.out.println("Even");
        } else ;
          {
            System.out.println(" odd");
          }*/
// find  three values which is largest
        /*int a=15;
        int b=16;
        int c=3;
        if(a>=b && a>=c)
        {
            System.out.println("A is the largest");
        }
        else if(a<=b && b>=c)
        {
            System.out.println("B is the largest");
        }
        else
        {
            System.out.println("c is the largest");
        }*/

// input from the user

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        System.out.println("Enter value of b:");
        int b = sc.nextInt();
        System.out.println("Enter value of c:");
        int c = sc.nextInt();
        if(a>=b && a>=c)
        {
            System.out.println("A is the largest");
        }
        else if(a<=b && b>=c)
        {
            System.out.println("B is the largest");
        }
        else
        {
            System.out.println("c is the largest");
        }*/

// nested
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        System.out.println("Enter value of b:");
        int b = sc.nextInt();
        System.out.println("Enter value of c:");
        int c = sc.nextInt();
        if(a>=b) {
            if (a >= c) {
                System.out.println(a + "is large");
            } else {
                System.out.println(c + "is large");
            }
        }
        else
        {
            if(b>=c) {
                System.out.println(b + " is larger");
            }
            else{
                System.out.println(c+"is larger");
            }
        }*/

// for grades

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade of a:");
        int a = sc.nextInt();
        System.out.println("Enter grade of b:");
        int b = sc.nextInt();
        System.out.println("Enter grade of c:");
        int c = sc.nextInt();
        if(a>=90) {
            if (a >=90) {
                System.out.println(a + "A grade");
            } else  {
                System.out.println(c + "A grade");
            }
        }
        else
        {
            if(b>=90) {
                System.out.println(b + "A grade");
            }
            else {
                System.out.println(c+" A grade");
            }
        }





        }
}