package Assignment;

import java.util.Scanner;

public class HypotenuseCalculation {

    public static double AreaOfTriangle (double side1, double side2){

        double area = Math.hypot(side1, side2);
        return area;
    }
    public static void main(String[] args) {
        System.out.println(AreaOfTriangle(5.0, 3.0));
    }
}
