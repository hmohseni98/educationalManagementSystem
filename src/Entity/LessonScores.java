package Entity;

public class LessonScores {
    private String year;
    private String term;
    private Lesson lessons;
    private Student student;
    private float score;

    public LessonScores(String year, String term, Lesson lessons, Student student, float score) {
        this.year = year;
        this.term = term;
        this.lessons = lessons;
        this.student = student;
        this.score = score;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public Lesson getLessons() {
        return lessons;
    }

    public void setLessons(Lesson lessons) {
        this.lessons = lessons;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
