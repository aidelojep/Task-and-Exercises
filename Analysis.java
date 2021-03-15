import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {

int passes=0;
int failures=0;
int studentCounter=1;
        Scanner input=new Scanner(System.in);

while( studentCounter<=10) {
    System.out.println("Kindly enter your exam result,  passed=60" );
    int result = input.nextInt();

    if (result>=60) {
        passes = passes + 1;
    } else {
        failures = failures + 1;
    }

    studentCounter++;
}
        System.out.printf("The total number of passes are: %d%n", passes);
        System.out.printf("The total number of failures are: %d%n", failures);

     if (passes>8){
    System.out.println("Bonus to Instructor!");
}





    }


}
