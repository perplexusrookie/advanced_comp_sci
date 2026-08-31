public class ControlFlow {

    public static void main(String[] args) {
        int score = 63;

        if (score >= 63) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }

        // an if statement checks the boolean condition inside the parenthesis, triggers first
        // instance in which boolean is true
        if (score >= 63) {
            System.out.println("passed");
        }
        if (score == 63) {
            System.out.println("passed 2");
        } else {
            System.out.println("failed");
        }

        // temperature
        int temperature = 101;
        if (temperature > 90) {
            System.out.println("holy smokes it's hot!");
        } else if (temperature >= 60) {
            System.out.println("this is nice");
        } else {
            System.out.println("i need hot chocolate");
        }

        int batteryPercent = 46;

        if (batteryPercent < 20) {
            System.out.println("Low Battery");
        } else {
            System.out.println("Battery ready");
        }


    }


}
