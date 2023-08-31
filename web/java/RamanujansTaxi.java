import java.util.HashMap;
import java.util.Map;

public class RamanujansTaxi {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java RamanujansTaxi <integer>");
            return;
        }

        int n = Integer.parseInt(args[0]);

        // To store sums of cubes
        Map<Integer, Pair> sums = new HashMap<>();

        for (int a = 1; a <= Math.cbrt(n); a++) {
            for (int b = a; b <= Math.cbrt(n); b++) {  // b starts from a to avoid duplicate pairs
                int sum = a * a * a + b * b * b;
                if (sum <= n && !sums.containsKey(sum)) {
                    sums.put(sum, new Pair(a, b));
                }
            }
        }

        for (int c = 1; c <= Math.cbrt(n); c++) {
            for (int d = c; d <= Math.cbrt(n); d++) {  // d starts from c to avoid duplicate pairs
                int sum = c * c * c + d * d * d;
                if (sums.containsKey(sum)) {
                    Pair pair = sums.get(sum);
                    if (c != pair.first && d != pair.second) {
                        System.out.println(sum + " = " + pair.first + "^3 + " + pair.second + "^3 = " + c + "^3 + " + d + "^3");
                    }
                }
            }
        }
    }

    static class Pair {
        int first, second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
