public class CubeRecursive {
    public static int cube(int n) {

        //base case
        if (n == 0)
            return 0;

        //recursive case
        return n * n * n;
    }
    public static void main(String[] args) {
        System.out.println("Cube of 4 is: " + cube(4));
    }
}
