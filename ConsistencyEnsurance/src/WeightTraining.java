class WeightTraining extends Exercise {
    private int sets, reps;

    public WeightTraining(String name, int sets, int reps) {
        super(name);
        this.sets = sets;
        this.reps = reps;
    }

    @Override
    public String toString() {
        return name + ": " + sets + " sets of " + reps + " reps";
    }
}
