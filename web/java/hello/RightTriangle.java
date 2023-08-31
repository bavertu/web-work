public class RightTriangle {

    public static void main(String[] args) {
        // Parse the command-line arguments to integers
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // Calculate the squares of the three integers
        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;

        // Check if the three numbers are positive and satisfy the Pythagoras theorem
        boolean isRightTriangle = (a > 0 && b > 0 && c > 0) && 
                                  ((a2 + b2 == c2) || (a2 + c2 == b2) || (b2 + c2 == a2));

        // Print the result
        System.out.println(isRightTriangle);
    }
}
