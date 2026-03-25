import java.util.*;

//This is my first project using hashmaps!

public class WorkoutManager {
    private Map<String, List<Exercise>> weeklySchedule;

    public WorkoutManager() {
        weeklySchedule = new HashMap<>(); //instantiate hashmap
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}; 
        for (String day : days) {
            weeklySchedule.put(day, new ArrayList<>()); //initialisation loop - iterates through array adds each day to the map,
                                                        //pairing it with an empty ArrayList (prevents NullPointerException when
                                                        //adding exersizes later.
        }
    }

    public void printSchedule() {
        System.out.println("\n --<YOUR WEEKLY SCHEDULE>-- ");
        //loops through the Map day by day
        for (String day : weeklySchedule.keySet()) {
            List<Exercise> exercises = weeklySchedule.get(day);

            System.out.println(day + ": ");
            if (exercises.isEmpty()) {
                System.out.println("Rest Day");
            }else {
                System.out.println();
                for (Exercise e : exercises) {
                    System.out.println(" -" + e.toString());
                }
            }
        } //Prints all the exercises (weight training and cardio) of each day
    }

    public void addExercise(String day, Exercise exercise) {
        weeklySchedule.get(day).add(exercise); //retrives the List<Exercise> associated with the provided day key
        //and appends the new Exercise object to the list with .add()
    }
}
