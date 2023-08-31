public class GeneralizedHarmonic {

    public static void main(String[] args) {

        // Check if there are two command-line arguments
        if (args.length != 2) {
            System.err.println("Usage: java GeneralizedHarmonic <n> <r>");
            return;
        }

        // Parse the two command-line arguments
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);

        // Compute the nth generalized harmonic number of order r
        double harmonic = 0.0;
        for (int i = 1; i <= n; i++) {
            harmonic += 1 / Math.pow(i, r);
        }

        // Print the result
        System.out.println(harmonic);
    }
}