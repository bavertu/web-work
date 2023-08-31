public class RelativelyPrime {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java RelativelyPrime <integer>");
            return;
        }

        int n = Integer.parseInt(args[0]);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (gcd(i, j) == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // two spaces for alignment
                }
            }
            System.out.println();
        }
    }

    // Compute gcd using Euclid's algorithm
    public static int gcd(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }
}
