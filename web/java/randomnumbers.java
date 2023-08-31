public class RandomNumbers {
    public static void main (String[] args) {
        double [] numbers = new double[5];

        //Generate and print 5 random numbers
        System.out.println("Generated random numbers:");
        for (int i=0; i < 5; i++) {
            numbers[i] = Math.random();
            System.out.println(numbers[i]);
        }

        //Calculate and print their average
        double sum = 0;
        for (double number : numbers) {
            sum += numbers;
        }
        double average = sum / 5;
        System.out.println("Average: "+ average);

        // Find and print the minimum and maximum values
        double min = numbers[0];
        double max = numbers[0];
        for (int i = 1; i < 5; i++) {
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

    }

}