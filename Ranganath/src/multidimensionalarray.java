/*public class multidimensionalarray {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("elements of 2d array:");
          for(int i=0;i< matrix.length;i++);
            for(int j=0;j< matrix.length;j++);{
                System.out.println(matrix[i][j]+" ");
        }
        System.out.println();
    }
}
*/

// get input from user

/*
import java.util.Scanner;

public class multidimensionalarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num of row and coloum");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] a = new int[row][col];
        int[][] b = new int[row][col];
        int[][] c = new int[row][col];

        System.out.println("enter the elements of 1st matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the elements of 2nd matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("sum of 2 matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
*/

// multiple of matrix

import java.util.Scanner;

public class multidimensionalarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows ");
        int row = sc.nextInt();
        System.out.println("Enter no of cols ");
        int col = sc.nextInt();
        int mat1[][] = new int[row][col];
        int mat2[][] = new int[row][col];
        int mul[][] = new int[row][col];

        System.out.println("Enter elements of matrix1");
        for(int i = 0;i<row;i++){
            for (int j = 0;j<col;j++){
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of matrix2");
        for(int i = 0;i<row;i++){
            for (int j = 0;j<col;j++){
                mat2[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<row;i++){
            for (int j = 0;j<col;j++){
                for(int k = 0;k<col;k++){
                    mul[i][j] = mul[i][j]+ mat1[i][k]*mat2[k][j];
                }
            }
        }
        System.out.println("the final sum of matrices is ");
        for(int i = 0;i<row;i++){
            for (int j = 0;j<col;j++){
                System.out.print(mul[i][j]+"   ");
            }
            System.out.println();
        }
    }
}

