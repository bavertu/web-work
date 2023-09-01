public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);  // Number of random indices to generate
        int n = args.length - 1;            // Number of probabilities
        int[] a = new int[n];               // Original probabilities
        int[] s = new int[n+1];             // Cumulative sums
        
        // Populate a[] with the given probabilities and compute cumulative sums in s[]
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i + 1]);
            s[i + 1] = s[i] + a[i];
        }

        // Generate m random indices
        for (int i = 0; i < m; i++) {
            // Get a random integer between 0 (inclusive) and s[n] (exclusive)
            int r = (int) (Math.random() * s[n]);

            // Find the unique index for r
            int index = 0;
            for (int j = 1; j <= n; j++) {
                if (r >= s[j - 1] && r < s[j]) {
                    index = j;
                    break;
                }
            }
            
            // Print the index
            System.out.print(index + " ");
        }
        System.out.println();
    }
}
