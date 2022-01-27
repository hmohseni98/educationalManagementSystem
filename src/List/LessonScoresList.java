package List;

import Entity.LessonScores;

public class LessonScoresList {
    private LessonScores[] lessonScores;
    private int emptyIndex = 0;
    private int saveIndex = 0;

    public LessonScoresList(int count) {

        this.lessonScores = new LessonScores[count];
    }

    public void add(LessonScores lessonScore) {
        lessonScores[emptyIndex] = lessonScore;
        emptyIndex++;
    }

    public void showLessonByNationalCode(String nationalCode) {
        if (emptyIndex != 0) {
            for (int i = 0; i < emptyIndex; i++) {
                if (lessonScores[i].getStudent().getNationalCode().equals(nationalCode)) {
                    System.out.println("LessonName:" + lessonScores[i].getLessons().getName() + "   " +
                            "LessonScore: " + lessonScores[i].getScore() + "   " +
                            "Year:" + lessonScores[i].getYear() + "   " +
                            "Term:" + lessonScores[i].getTerm());
                }
            }
        }
    }

    public boolean takeLessonByStudent(String nationalCode, String lessonName) {
        for (int i = 0; i < emptyIndex; i++) {
            if (lessonScores[i].getStudent().getNationalCode().equals(nationalCode) &&
                    lessonScores[i].getLessons().getName().equals(lessonName))
                return true;
        }
        return false;
    }

    public LessonScores searchByNameReturnLessonScores(String nationalCode) {
        for (int i = 0; i < emptyIndex; i++) {
            if (lessonScores[i].getStudent().getNationalCode().equals(nationalCode))
                return lessonScores[i];
        }
        return null;
    }

    public float totalAvgByNationalCode(String nationalCode, String year, String term) {
        float totalAvg = 0;
        int counter = 0;
        for (int i = 0; i < emptyIndex; i++) {
            if (lessonScores[i].getStudent().getNationalCode().equals(nationalCode) &&
                    lessonScores[i].getYear().equals(year) && lessonScores[i].getTerm().equals(term)) {
                totalAvg = totalAvg + lessonScores[i].getScore();
                counter++;
            }
        }
        if (totalAvg == 0) {
            return 14;
        } else
            return (totalAvg / counter);
    }
}