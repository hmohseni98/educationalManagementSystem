package List;

import Entity.SelectUnit;

public class SelectUnitList {
    private SelectUnit[] selectUnits;
    private LessonScoresList lessonScoresList;
    private int emptyIndex = 0;

    public SelectUnitList(int count) {

        this.selectUnits = new SelectUnit[count];
    }
    public boolean checkSelectLesson(String nationalCode,String lessonName){
        for (int i = 0; i < emptyIndex; i++) {
            if(selectUnits[i].getStudent().getNationalCode().equals(nationalCode) &&
            selectUnits[i].getLesson().getName().equals(lessonName))
                return true;
        }
        return false;
    }
    public void add(SelectUnit selectUnit) {
        /*float giveTotalAvgLastTerm = lessonScoresList.totalAvgByNationalCode(selectUnit.getStudent().getNationalCode(),
                selectUnit.getYear(),String.valueOf(Integer.valueOf(selectUnit.getTerm()) - 1));
        boolean checkTakeLessonByStudent = lessonScoresList.takeLessonByStudent(selectUnit.getStudent().getNationalCode(),
                selectUnit.getLesson().getName());
        boolean checkSelectLesson = checkSelectLesson(selectUnit.getStudent().getNationalCode(),selectUnit.getLesson().getName());*/
        boolean checkTakeLessonByStudent = false;
        boolean checkSelectLesson = false;
        float giveTotalAvgLastTerm = 18.25F;
        if (checkTakeLessonByStudent == false && checkSelectLesson == false ) {
            if (giveTotalAvgLastTerm >= 18.0) {
                if (selectUnit.getCountOfUint() <= 24) {
                    selectUnits[emptyIndex] = selectUnit;
                    emptyIndex++;
                    selectUnit.setCountOfUint(selectUnit.getCountOfUint() + selectUnit.getLesson().getNumberOfUnit());
                } else {
                    return;
                }
            }else{
                if (selectUnit.getCountOfUint() <= 20){
                    selectUnits[emptyIndex] = selectUnit;
                    emptyIndex++;
                    selectUnit.setCountOfUint(selectUnit.getCountOfUint() + selectUnit.getLesson().getNumberOfUnit());
                }
            }
        }
        else{
            return;
        }
    }
    public void showLessonByNationalCode(String nationalCode) {
        if (emptyIndex != 0) {
            for (int i = 0; i < emptyIndex; i++) {
                if (selectUnits[i].getStudent().getNationalCode().equals(nationalCode)) {
                    System.out.println("LessonName:" + selectUnits[i].getLesson().getName() + "   " +
                            "Year:" + selectUnits[i].getYear() + "   " +
                            "Term:" + selectUnits[i].getTerm());
                }
            }
        }
    }
}
