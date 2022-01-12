package EducationalSystemManagement;

public class PresentingLessonsList {
    private PresentingLesson[] presentingLessons;
    private int emptyIndex = 0;

    public PresentingLessonsList(int count) {

        this.presentingLessons = new PresentingLesson[count];
    }

    public void add(PresentingLesson presentingLesson) {
        presentingLessons[emptyIndex] = presentingLesson;
        emptyIndex++;
    }
    public int search(String year,String term,String nationalcode){
        int count = 0;
        for (int i = 0; i < emptyIndex; i++) {
            if (presentingLessons[i].getYears().equals(year) && presentingLessons[i].getTerm().equals(term) &&
            presentingLessons[i].getTeacher().getNationalCode().equals(nationalcode))
                count = count + presentingLessons[i].getLesson().getNumberOfUnit();
        }
        return count;
    }
}