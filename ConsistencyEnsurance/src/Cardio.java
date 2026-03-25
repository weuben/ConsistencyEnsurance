class Cardio extends Exercise{
    private int minutes;

    public Cardio(String name, int minutes) {
        super(name);
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return name + ": " + minutes + " minutes of cardio";
    }
}
