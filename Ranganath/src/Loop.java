import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        /*int i = 0;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }*/

// input from user while loop
    /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        while(number<=100){
            System.out.println(number);
            number++;
        }*/
// some of natural num using while loop

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of i : ");
        int i = sc.nextInt();
        int n=20; int sum=0;
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println(sum);*/

// for loop
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        for( int i=0; i<=n; i++)
        {
            System.out.println(i);
        }*/

// sum of natural num using for loop

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int sum=0;
        for( int i=0; i<=n; i++);
        {
            sum=sum+i;
        }
        System.out.println(sum);*/

// do while loop
        /*int i=1;
    do {
        System.out.println(i);
        i++;
    } while(i<=5);
      System.out.println(i);

         */

// for nested loop
       /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of row and col : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        for(int i=0;i<row;i++)
        {
            for (int j = 0; j <= col; j++)
            {
                System.out.print(i + " " + j);
            }
            System.out.println();
        }*/

//  triangle

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of row and col : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
       */
//
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of row and col : ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        for(int i = row; i >= 1; --i) {
            for(int space = 1; space <= row - i; ++space) {
                System.out.print(" * ");
            }

            for(int j=i; j <= 2 * i - 1; ++j) {
                System.out.print(" ");
            }

            for(int j = 0; j < i - 1; ++j) {
                System.out.print("  ");
            }

            System.out.println();
        }
        }
    }

