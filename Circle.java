package Day_1;

import java.util.Scanner;

public class Circle {


    int radius;
    final double pi=3.14;
    public double circumference()
    {
        return 2*pi*radius;
    }
    public double area()
    {
        return pi*radius*radius;
    }
    public static void main(String[] args)
    {
    	Circle c=new Circle();
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter value of radius:");
        c.radius = sca.nextInt();
        double circumference = c.circumference();
        double area=c.area();
        System.out.println("Circumference:"+circumference);
        System.out.println("Area:"+area);
    }
}
