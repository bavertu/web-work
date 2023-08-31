public class PrimeCounter {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java PrimeCounter <integer>");
            return;
        }

        int n = Integer.parseInt(args[0]);
        System.out.println(countPrimes(n) + " primes less than or equal to " + n);
    }

    public static int countPrimes(int n) {
        if (n < 2) return 0;

        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }
}
