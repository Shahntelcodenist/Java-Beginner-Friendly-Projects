//import java.util.Scanner

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        //Declare and intialixation
        String name;
        int age;
        double GPA;

        //Create scanner object
        //also print output
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Enter your GPA: ");
        GPA = scanner.nextDouble();

        System.out.println("Hello " + name + "!");

scanner.close();
    }
}