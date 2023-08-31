public class Kary {
    public static void main(String[] args) {
        // Validate and parse command line arguments
        if (args.length != 2) {
            System.out.println("Usage: java Kary <integer> <base>");
            return;
        }

        long i = Long.parseLong(args[0]);
        int k = Integer.parseInt(args[1]);

        // Validate base
        if (k < 2 || k > 16) {
            System.out.println("Base k should be between 2 and 16.");
            return;
        }

        System.out.println(convertToBaseK(i, k));
    }

    // Convert to base k
    public static String convertToBaseK(long number, int k) {
        if (number == 0) return "0";  // Handle the special case

        StringBuilder sb = new StringBuilder();
        while (number > 0) {
            long digit = number % k;
            sb.append(digitToChar(digit));
            number /= k;
        }

        return sb.reverse().toString();  // Reverse to get the correct order
    }

    // Convert digit to corresponding char representation
    public static char digitToChar(long digit) {
        if (digit >= 0 && digit <= 9) {
            return (char) ('0' + digit);
        } else if (digit >= 10 && digit <= 15) {
            return (char) ('A' + digit - 10);
        } else {
            throw new IllegalArgumentException("Invalid digit for base conversion: " + digit);
        }
    }
}
