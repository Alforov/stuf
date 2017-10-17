package blocking;

/**
 * Created by mikhail_alferov on 12.09.2017.
 */
public abstract class Manager implements Comparable<Manager> {
    private final String name;
    public String problem;


    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }
}
