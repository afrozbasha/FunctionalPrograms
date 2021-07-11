package com.FunctionalPrograms;
import java.lang.Math;
public class Distance {
    public static void main(String args[]) {
        System.out.println("Takes a command-line argument Num is : "+ args[0]+" "+args[1]);
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        double r = Math.sqrt(Math.pow(y - x, 2) + Math.pow(0 - 0, 2) );
        System.out.println("Distance of two integer points "+"("+x+" ,"+y+") "+ "to the origin (0, 0) : "+ r);

    }
}
