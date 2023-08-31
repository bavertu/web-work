public class BandMatrix {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java BandMatrix <n> <width>");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Calculate the distance from the main diagonal
                int distance = Math.abs(i - j);

                // Check if distance is within the width to determine whether to print * or 0
                if (distance <= width) {
                    System.out.print("*  ");
                } else {
                    System.out.print("0  ");
                }
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
