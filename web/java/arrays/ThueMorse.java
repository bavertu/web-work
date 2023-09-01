public class ThueMorse {
    
    // Helper function to determine if two integers have the same parity of 1-bits
    private static boolean sameParityOfOnes(int a, int b) {
        // Calculate the number of 1-bits for each number and take their modulo by 2
        // If they have the same parity, return true
        return Integer.bitCount(a) % 2 == Integer.bitCount(b) % 2;
    }
    
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // Generate the n-by-n pattern based on Thue–Morse sequence
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sameParityOfOnes(i, j)) {
                    System.out.print("+  ");
                } else {
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
    }
}

