//import scanner class
import java.util.Scanner;

public class TeamFormation {
    public static void main(String[] args) {

        //declare variables
        int totalNumber;
        int teamSize;

        //create scanner object
        Scanner scanner = new Scanner(System.in);

        //prompt user
        System.out.print("Enter Total number of students: ");
        totalNumber = scanner.nextInt();
        System.out.print("Enter team size: ");
        teamSize = scanner.nextInt();

        //calculates number of teams

        int numberOfTeams = totalNumber/teamSize;
        int studentsLeft = totalNumber%teamSize;

        //print output
        System.out.println("Total teams formed is: " + numberOfTeams);
        System.out.println("Student without teams isf/are: " + studentsLeft);

        //close scanner object

        scanner.close();



    }
}