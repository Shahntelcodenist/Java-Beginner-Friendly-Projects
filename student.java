public class student {
    public static void main (String[] args) {

        //command line arguments

        String name = args[0];
        double biology =Double.parseDouble(args[1]);
        double physics=Double.parseDouble(args[2]);
        int yearOfBirth=Integer.parseInt(args[3]);

        //calculate average
        //need to get sum first
        double sum = biology + physics;
        double average = sum/2;

        //square of average

        double square_Average = Math.pow(average, 2);

        //calculate age from year of birth
        int age = 2024 -yearOfBirth;

        //print system output
        System.out.println("Average of square is: " + square_Average);
        System.out.println("Student name is(lowercase): " + name.toLowerCase());
        System.out.println("Age is: " + age);

    }
}

