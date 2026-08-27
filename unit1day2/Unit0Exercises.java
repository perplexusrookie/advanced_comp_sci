public class Unit0Exercises {
    public static void main(String[] args) {
        System.out.println("--- Variable Snapshot ---");

        int score = 85;
        double price = 19.99;
        boolean isPassing = true;

        System.out.println("Score: " + score + "\nPrice: " + price + "\nPassing: " + isPassing);

        score += 5;
        price += 2.50;
        isPassing = false;

        System.out.println("--- After Updates ---");

        System.out.println("Score: " + score + "\nPrice: " + price + "\nPassing: " + isPassing);

        final double TAX_RATE = 0.0925;
        char grade = 'A';
        System.out.println("grade: " + grade);
        long population = 8000000000L;
        System.out.println(population);

    }
}
