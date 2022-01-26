package Entity;

public class EducationalBackground {
    private String year;
    private String term;
    private Student student;
    //private LessonScores lessonScores;
    private float totalAvg;

    public EducationalBackground(String year, String term, Student student, float totalAvg) {
        this.year = year;
        this.term = term;
        this.student = student;
        //this.lessonScores = lessons;
        this.totalAvg = totalAvg;
    }
}
