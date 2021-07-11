package com.FunctionalPrograms;
import java.util.Scanner;

public class Array2D {
    public static void display(int[][] array, int m, int n) {
        int i, j;
    }

    public static void main(String[] args) {
	    Scanner num = new Scanner(System.in);
        System.out.println("1: Create integer 2D array");
        System.out.println("2: Create double 2D array");
        System.out.println("3: Create boolean 2D array");
        System.out.print("Choose the 2D arrays : ");

        int cse = num.nextInt();

        if(cse > 0 && cse <= 3){
            System.out.print("Enter No.of Rows : ");
            int m = num.nextInt();
            System.out.print("Enter No.of Columns : ");
            int n = num.nextInt();

            int array1[][] = new int[m][n];
            double array2[][] = new double[m][n];
            boolean array3[][] = new boolean[m][n];

            switch (cse) {
                case 1:
                    System.out.print("Enter int elements of the array : ");
                    int i, j;
                    for (i = 0; i < m; i++) {
                        for (j = 0; j < n; j++) {
                            array1[i][j] = num.nextInt();
                        }
                    }
                    System.out.println("Array elements are : ");
                    for ( i=0; i<m; i++){
                        for ( j=0; j<n; j++){
                            System.out.print(array1[i][j]+" ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Enter double elements of the array : ");
                    for (i = 0; i < m; i++) {
                        for (j = 0; j < n; j++) {
                            array2[i][j] = num.nextDouble();
                        }
                    }
                    System.out.println("Array elements are : ");
                    for ( i=0; i<m; i++){
                        for ( j=0; j<n; j++){
                            System.out.print(array2[i][j]+" ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("Enter boolean elements of the array : ");
                    for (i = 0; i < m; i++) {
                        for (j = 0; j < n; j++) {
                            array3[i][j] = num.nextBoolean();
                        }
                    }
                    System.out.println("Array elements are : ");
                    for ( i=0; i<m; i++){
                        for ( j=0; j<n; j++){
                            System.out.print(array3[i][j]+" ");
                        }
                        System.out.println();
                    }
                    break;
            }
        }
    }
}
