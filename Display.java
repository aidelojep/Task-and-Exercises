import java.util.Scanner;

public class Display {
    public static void main(String[]args)
    {

        Scanner love= new Scanner(System.in);

        double  secondNumber, thirdNumber, radius, area, diameter, circumference;
        double PIE = 3.142;

        System.out.println("kindly enter you fNumber :");
        radius = love.nextDouble();

        System.out.println("Kindly enter your sNumber :");
         secondNumber = love.nextDouble();

        System.out.println("Kindly enter your tNumber :");
         thirdNumber = love.nextDouble();



         diameter = 2 * (radius);
        System.out.printf("The diameter value of the circle is :%f%n ", diameter);

        circumference = 2 * PIE * radius;
        System.out.printf("The circumference value is :%f%n", circumference);


         area = PIE * radius * radius;
        System.out.printf("The area of the circle is :%f%n", area);



    }
}
