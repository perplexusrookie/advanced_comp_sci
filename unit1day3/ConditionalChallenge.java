public class ConditionalChallenge {
    public static void main(String[] args) {

        System.out.println("--- Part 1: Temperature Converter ---");
        double temperature = 75.0;
        boolean isCold = true;

        temperature = isCold ? (temperature -= 15) : (temperature -= 10);

        System.out.printf("Temperature: " + "%.1f%n", (double) temperature);


        System.out.println("--- Part 2: Grade Calculator ---");

        int score = 85;
        System.out.println("Score: " + score);

        if (score >= 80) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        System.out.println("--- Part 3: Season Determiner ---");

        int temp = 65;
        System.out.println("Temperature: " + temp);

        if (temp >= 80) {
            System.out.println("Season: Summer");
        } else if (temp >= 60) {
            System.out.println("Season: Spring");
        } else if (temp >= 40) {
            System.out.println("Season: Fall");
        } else {
            System.out.println("Season: Winter");
        }

        System.out.println("--- Part 4: Number Classifier ---");

        int number = 42;
        System.out.println("Number: " + number);

        if (number > 0) {
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else {
            System.out.println(number + " is zero");
        }

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        if (number % 5 == 0) {
            System.out.println(number + " is a multiple of 5");
        } else {
            System.out.println(number + " is not a multiple of 5");
        }

        if (number % 3 == 0) {
            System.out.println(number + " is a multiple of 3");
        } else {
            System.out.println(number + " is not a mumltiple of 3");
        }

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Multiple of 15: yes");
        }

        System.out.println("--- Part 5: Day Classifier ---");

        String day = "Saturday";
        String type = switch (day) {
            case "Saturday", "Sunday" -> "Weekend";
            default -> "Weekday";
        };
        System.out.println("Type: " + type);

    }
}
