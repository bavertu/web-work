public class Minesweeper {

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        // To represent mines and the counts of neighboring mines
        char[][] grid = new char[m][n];

        // Randomly place the mines
        for (int i = 0; i < k; ) {
            int row = (int) (Math.random() * m);
            int col = (int) (Math.random() * n);

            if (grid[row][col] != '*') {
                grid[row][col] = '*';
                i++;
            }
        }

        // Check each cell and calculate the neighboring mines
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] != '*') {
                    int count = 0;
                    for (int i = -1; i <= 1; i++) {
                        for (int j = -1; j <= 1; j++) {
                            if (row + i >= 0 && row + i < m && col + j >= 0 && col + j < n) {
                                if (grid[row + i][col + j] == '*') {
                                    count++;
                                }
                            }
                        }
                    }
                    grid[row][col] = (char) ('0' + count);
                }
            }
        }

        // Print the grid
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(grid[row][col] + "  ");
            }
            System.out.println();
        }
    }
}
