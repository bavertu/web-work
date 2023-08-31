public class GreatCircle {

    public static void main(String[] args) {
        // Get the latitude and longitude values from command line arguments
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        // Convert the degrees to radians
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        // Compute the differences of the latitudes and longitudes
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;

        // Apply the Haversine formula
        double a = Math.pow(Math.sin(deltaX / 2), 2) + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin(deltaY / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        // Earth's radius in kilometers
        final double r = 6371.0;

        // Compute the distance
        double distance = r * c;

        // Print the distance
        System.out.println("Great-circle distance: " + distance + " kilometers");
    }
}
