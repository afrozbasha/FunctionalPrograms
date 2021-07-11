package com.FunctionalPrograms;
import java.util.Scanner;

public class ThreeIntZero {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Nums range n : ");
        int n = num.nextInt();
        int array[] = new int[n];
        System.out.print("Enter int elements of the array : ");
        int i, j, k;
        for (i = 0; i < n; i++) {
            array[i] = num.nextInt();
            }
        for (i=0; i<n; i++){
            for (j=i+1; j<n; j++){
                for (k=j+1; j<n; k++){
                    if ((array[i]+array[j]+array[k]) == 0){
                        System.out.println(array[i]+" ,"+array[j]+" ,"+array[k]+" : Zero");
                    }
                }
            }
        }


    }
}
