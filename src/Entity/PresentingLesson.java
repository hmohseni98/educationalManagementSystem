package Entity;

public class PresentingLesson {
    private String id;
    private String years;
    private String term;
    private Lesson lesson;
    private Teacher teacher;

    public PresentingLesson(String id, String years, String term, Lesson lesson, Teacher teacher) {
        this.id = id;
        this.years = years;
        this.term = term;
        this.lesson = lesson;
        this.teacher = teacher;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}

