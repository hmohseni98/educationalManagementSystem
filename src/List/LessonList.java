package List;

import Entity.Lesson;

public class LessonList {
    private Lesson[] lessons;
    private int emptyIndex = 0;
    private int saveIndex;

    public LessonList(int count) {

        this.lessons = new Lesson[count];
    }

    public void add(Lesson lesson) {
        lessons[emptyIndex] = lesson;
        emptyIndex++;
    }

    public int searchByName(String name) {
        if(emptyIndex != 0) {
            for (int i = 0; i < emptyIndex; i++) {
                if (lessons[i].getName().equals(name))
                    return i;
            }
        }
        return -1;
    }

    public Lesson searchByNameReturnLesson(String name) {
        if(emptyIndex != 0) {
            for (int i = 0; i < emptyIndex; i++) {
                if (lessons[i].getName().equals(name))
                    return lessons[i];
            }
        }
        return null;
    }

    public int searchById(String id) {
        if(emptyIndex != 0) {
            for (int i = 0; i < emptyIndex; i++) {
                if (lessons[i].getId() == id)
                    return i;
            }
        }
        return -1;
    }

    public void remove(String name) {
        if (emptyIndex != 0) {
            saveIndex = searchByName(name);
            if (saveIndex >= 0) {
                for (int j = saveIndex; j < emptyIndex - 1; j++) {
                    lessons[j] = lessons[j + 1];
                }
                emptyIndex--;
            }
        }
    }

    public void edit(String id, String name, int numberOfUnit) {
        if (emptyIndex != 0) {
        saveIndex = searchById(id);
        if (saveIndex >= 0) {
            lessons[saveIndex].setName(name);
            lessons[saveIndex].setNumberOfUnit(numberOfUnit);
        }
    }
}
    public void show(){
        if(emptyIndex != 0) {
            for (int i = 0; i < emptyIndex ; i++) {
                System.out.println("ID:" + lessons[i].getId() + "   " +
                        "Name:" + lessons[i].getName() + "   " +
                        "NumberOfUnit:" + lessons[i].getNumberOfUnit());
            }
        }
    }
}