package EducationalSystemManagement;

public class EducationalBackgroundList {
    private EducationalBackground[] educationalBackgrounds;
    private int emptyIndex = 0;

    public EducationalBackgroundList(int count) {

        this.educationalBackgrounds = new EducationalBackground[count];
    }

    public void add(EducationalBackground educationalBackground) {
        educationalBackgrounds[emptyIndex] = educationalBackground;
        emptyIndex++;
    }
}