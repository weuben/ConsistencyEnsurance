//this class cannot be used, only as blueprint hence abstract
abstract public class Exercise {
    //protected keyword can be used by subclasses (even in different packages) only
    protected String name;

    public Exercise(String name) {
        this.name = name;
    }

    public abstract String toString();
}