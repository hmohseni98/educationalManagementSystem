package Entity;

public class Lesson {
    private String id;
    private String name;
    private int numberOfUnit;

    public Lesson(String id, String name, int numberOfUnit) {
        this.id = id;
        this.name = name;
        this.numberOfUnit = numberOfUnit;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getNumberOfUnit() {
        return numberOfUnit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfUnit(int numberOfUnit) {
        this.numberOfUnit = numberOfUnit;
    }
}
