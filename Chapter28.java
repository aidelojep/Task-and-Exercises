import java.util.Scanner;

public class Chapter28 {
    public static void main(String[]args){

            int a,
                b,
                c;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer :");
        a = input.nextInt();
        System.out.print("Enter an Integer :");
        b = input.nextInt();


        int number;
       number = a = b;

        c = a * b;
        System.out.printf("%s%n this is the product and broaden ",  c);
    }
}
