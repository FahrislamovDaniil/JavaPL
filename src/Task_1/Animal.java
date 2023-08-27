package Task_1;

public class Animal {
    private String name;
    private int runLimit;
    private int swimLimit;

    public Animal() {
    }

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public void setRunLimit(int runLimit) {
        this.runLimit = runLimit;
    }

    public int getSwimLimit() {
        return swimLimit;
    }

    public void setSwimLimit(int swimLimit) {
        this.swimLimit = swimLimit;
    }

    public void run(int dist) {
        if (dist > this.runLimit)
            dist = this.runLimit;
        System.out.println(this.name + " пробежал " + dist + " м");
    }

    public void swim(int dist) {
        if (dist > this.swimLimit)
            dist = this.swimLimit;
        System.out.println(this.name + " проплыл " + dist + " м");
    }
}