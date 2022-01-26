package Entity;

public class SelectUnit {
    private String year;
    private String term;
    private Student student;
    private Lesson lesson;
    private LessonScores lessonScores;
    private int countOfUint;

    public SelectUnit(String year, String term, Student student, Lesson lesson, LessonScores lessonScore) {
        this.year = year;
        this.term = term;
        this.student = student;
        this.lesson = lesson;
        this.lessonScores = lessonScore;
        this.countOfUint = 0; // *********
    }

    public int getCountOfUint() {
        return countOfUint;
    }

    public void setCountOfUint(int countOfUint) {
        this.countOfUint = countOfUint;
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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }
}
