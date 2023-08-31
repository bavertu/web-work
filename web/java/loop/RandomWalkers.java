public class RandomWalkers {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java RandomWalkers <r> <trials>");
            return;
        }

        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        long totalSteps = 0;  // sum of steps for all trials

        for (int t = 0; t < trials; t++) {
            int x = 0, y = 0;  // starting point for each trial
            int steps = 0;     // number of steps taken for each trial

            while (Math.abs(x) + Math.abs(y) != r) {
                double randomValue = Math.random();

                // Decide the direction based on the random value
                if (randomValue < 0.25) {
                    x++;  // move east
                } else if (randomValue < 0.5) {
                    x--;  // move west
                } else if (randomValue < 0.75) {
                    y++;  // move north
                } else {
                    y--;  // move south
                }

                steps++;
            }

            totalSteps += steps;  // accumulate total steps for each trial
        }

        double averageSteps = (double) totalSteps / trials;  // compute average steps
        System.out.println("average number of steps = " + averageSteps);
    }
}

