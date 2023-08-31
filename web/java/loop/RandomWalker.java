public class RandomWalker {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java RandomWalker <r>");
            return;
        }

        int r = Integer.parseInt(args[0]);

        int x = 0, y = 0;  // starting point
        int steps = 0;     // number of steps taken

        System.out.println("(" + x + ", " + y + ")");

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
            System.out.println("(" + x + ", " + y + ")");
        }

        System.out.println("steps = " + steps);
    }
}

