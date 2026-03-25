import java.util.Scanner;

public class FitnessApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WorkoutManager manager = new WorkoutManager();
        boolean running = true;

        System.out.println("Welcome to Consistency Ensurance....");

        while (running) {
            System.out.println("\n ---<MAIN MENU>--- ");
            System.out.println("1. Add Exercise to a Day");
            System.out.println("2. View Weekly Schedule");
            System.out.println("3. Exit");
            System.out.println("Enter option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter a day e.g. Monday: ");
                    String day = scanner.nextLine();

                    System.out.println("Type (1 for Weights, 2 for Cardio): ");
                    int type = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Exercise Name: ");
                    String name = scanner.nextLine();

                    if (type == 1) {
                        System.out.println("Sets: ");
                        int sets = scanner.nextInt();
                        System.out.println("Reps: ");
                        int reps = scanner.nextInt();
                        manager.addExercise(day, new WeightTraining(name, sets, reps));
                    }else {
                        System.out.println("Minutes: ");
                        int mins = scanner.nextInt();
                        manager.addExercise(day, new Cardio(name, mins));
                    }
                    System.out.println("Added successfully...");
                    break;

                case 2:
                    manager.printSchedule();
                    break;

                case 3:
                    running = false;
                    break;
            }
        }
        scanner.close();
    }
}
