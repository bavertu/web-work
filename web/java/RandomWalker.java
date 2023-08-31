public class RandomWalker {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java RandomWalker <integer>");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int trials = 10000;  // Number of experiments to estimate the average
        long totalSteps = 0;

        for (int t = 0; t < trials; t++) {
            totalSteps += walk(n);
        }

        System.out.println("Average number of steps = " + (double) totalSteps / trials);
    }

    public static int walk(int n) {
        int x = 0, y = 0;
        int steps = 0;

        while (Math.abs(x) < n && Math.abs(y) < n) {
            double random = Math.random();
            if (random < 0.25) x++;        // move east
            else if (random < 0.5) x--;   // move west
            else if (random < 0.75) y++;  // move north
            else y--;                     // move south
            steps++;
        }

        return steps;
    }
}
