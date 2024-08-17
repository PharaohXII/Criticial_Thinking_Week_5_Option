
import java.util.ArrayList;
import java.util.Scanner;

public class weeklyTemperature {
    public static void main(String[] args) {
        //Initializing array lists
        ArrayList<String> daysOfWeek = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        //Step 2 Defining Variables
        String inputDay;
        double inputTemperature;
        double sum = 0;
        double weeklyAverage;

        //Step 3 loop to get user input for each day from the user
        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (String day : days) {
            System.out.println("Enter the average temperature for " + day + ":");
            inputTemperature = scanner.nextDouble();
            daysOfWeek.add(day);
            temperatures.add(inputTemperature);
            sum += inputTemperature;
        }

        //Step 4: Loop to prompt the user for the day of the week or "week" to display information
        while (true) {
            System.out.print("Enter a day of the week ( or 'Week' to see all data and weekly average): ");
            inputDay = scanner.next();

            if (inputDay.equalsIgnoreCase("week")) {
                System.out.println("Weekly temperatures:");
                for (int i = 0; i < daysOfWeek.size(); i++) {
                    System.out.println(daysOfWeek.get(i) + ": " + temperatures.get(i) + "°"); 
                }
                weeklyAverage = sum / 7;
                System.out.println("Weekly Average Temperature: " + weeklyAverage + "°");
                break; //Exit loop after displaying the weekly data
            } else if (daysOfWeek.contains(inputDay)) {
                int index = daysOfWeek.indexOf(inputDay);
                System.out.println(inputDay + ": " + temperatures.get(index) + "°");
            } else {
                System.out.println("Invalid input please enter a valid weekday or 'week'.");

            }
        }

        scanner.close();
    }
}