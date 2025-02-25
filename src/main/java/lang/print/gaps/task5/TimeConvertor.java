package lang.print.gaps.task5;

public class TimeConvertor {
    public void convert(float minutes) {
        // Convert minutes to seconds
        float seconds = minutes * 60;

        // Print the result
        System.out.println(minutes + " minutes is equal to " + seconds + " seconds.");
    }

    public static void main(String[] args) {
        // Create an instance of TimeConvertor
        TimeConvertor converter = new TimeConvertor();

        // Test the convert method
        converter.convert(11.5f); // Example: Convert 5 minutes to seconds
    }
}
