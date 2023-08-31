public class BinomialCoefficients {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java BinomialCoefficients <integer>");
            return;
        }

        int n = Integer.parseInt(args[0]);

        double[][] a = new double[n + 1][];

        // Initial conditions
        for (int i = 0; i <= n; i++) {
            a[i] = new double[i + 1];
            a[i][0] = 0.0;
        }
        if (n > 0) a[1][1] = 1.0;

        // Compute the binomial coefficients
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                a[i][j] = (a[i - 1][j] + a[i - 1][j - 1]) / 2.0;
            }
        }

        // Display the results
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
