package arrays;
public class Birthday {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);       // Number of days in a year
        int trials = Integer.parseInt(args[1]);  // Number of trials

        int[] count = new int[n + 2];
        for (int t = 0; t < trials; t++) {
            boolean[] hasBirthday = new boolean[n];  // Initialize room

            for (int people = 1; people <= n + 1; people++) {
                int day = (int) (Math.random() * n); // Random birthday
                if (hasBirthday[day]) {              // If someone has this birthday, stop
                    count[people]++;
                    break;
                }
                hasBirthday[day] = true;             // Update the room
            }
        }

        // Calculate and print the cumulative results
        int total = 0;
        for (int i = 1; i <= n + 1 && total < trials/2; i++) {
            total += count[i];
            System.out.printf("%d\t%d\t%.5f\n", i, total, (double) total / trials);
        }
    }
}
