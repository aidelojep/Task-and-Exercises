import java.util.Scanner;

public class ProductName {




 public static void main(String[] args) {
  
 Scanner input = new Scanner(System.in);

   int a,
         b,
         c,
     product;



System.out.print ("Enter firstNumber");
 a = input.nextInt();


System.out.print ("Enter secondNumber");
b = input.nextInt();

System.out.print ("Enter thirdNumber");
c = input.nextInt();

product = a * b * c ;
 
System.out.printf("product is: %d%n", product);

}


}