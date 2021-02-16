import java.util.Scanner;

public class AssignmentOperator {

   

      public static void main (String [] args)
        {int number1,
             number2,
             number3,
          product;
Scanner input = new Scanner(System.in);

System.out.print("Enter firstNumber:");
  number1 = input.nextInt();

System.out.print("Enter secondNumber:");
  number2 = input.nextInt();

System.out.print("Enter thirdNumber:");
  number3 = input.nextInt();

product = number1 * number2 * number3;

System.out.printf("The result is: %d%n", product);



}


}