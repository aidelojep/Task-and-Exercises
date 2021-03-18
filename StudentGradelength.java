package array;

import java.util.Scanner;

public class StudentGradelength{

    public static void main(String[] args) {

        int total =0;
        int gradeCounter=0;
        int aCourse=0;
        int bCourse=0;
        int cCourse=0;
        int dCourse=0;
        int fCourse=0;

        Scanner myScan = new Scanner(System.in);
        System.out.printf("%s%n%s%n   %s%n   %s%n", "Enter the integer grades in the range 0-100.", "Type the end-of-file indicator to terminate input:", "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter", "On Windows type <Ctrl> z then press Enter");
        while(myScan.hasNext()) {
            int grade= myScan.nextInt();
            total +=grade;
            ++gradeCounter;

            switch(grade/10) {
                case 9:
                case 10:
                    ++aCourse;
                    break;

                case 8:
                    ++bCourse;
                    break;
                case 7:
                    ++cCourse;
                    break;
                case 6:
                    ++dCourse;
                    break;
                default:
                    ++fCourse;
                    break;
            }

            }
        System.out.printf("%nGrade value is: %n");
        if (gradeCounter != 0) {
            double average= (double) total/gradeCounter;
            System.out.printf("The value of gradeCounter and total is :%n%d%n%d", gradeCounter, total);
            System.out.printf("The value of average is :%.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Number of student who recived such grade:",
                      "A: ", aCourse,
                      "B: ", bCourse,
                      "C: ", cCourse,
                      "D: ", dCourse,
                      "F: ", fCourse);

            
        }
    else
        System.out.println("No grades were entered");
        }
    }
