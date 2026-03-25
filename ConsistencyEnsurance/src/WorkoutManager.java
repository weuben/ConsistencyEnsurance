import java.util.*;

public class WorkoutManager {
    private Map<String, List<Exercise>> weeklySchedule;

    public WorkoutManager() {
        weeklySchedule = new HashMap<>();
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (String day : days) {
            weeklySchedule.put(day, new ArrayList<>());
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
        }
    }

    public void addExercise(String day, Exercise exercise) {
        weeklySchedule.get(day).add(exercise);
    }
}
