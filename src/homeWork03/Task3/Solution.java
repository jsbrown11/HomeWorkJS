package homeWork03.Task3;


import java.util.Date;

public class Solution {
    public static void main(String[] args) {

        Date startDate = new Date();
        Course[] course = new Course[6];
        course[0] = new Course("Инфоматика", 89, "Сидоров");
        course[1] = new Course("Математика", 99, "Петров");
        course[2] = new Course("Английский", 45, "Павлов");
        course[3] = new Course("Испанский", 57, "Васин");
        course[4] = new Course("Физика", 45, "Александров");
        course[5] = new Course(startDate, "Психология");

        Student student1 = new Student("Антон", "Антонов", 6);
        Student student2 = new Student("Антонов",course);

        CollegeStudent cs1 = new CollegeStudent("Артём", "Артёмов", 34);
        CollegeStudent cs2 = new CollegeStudent("Артёмов", course);
        CollegeStudent cs3 = new CollegeStudent("RC", 1, 143);

        SpecialStudent sp1 = new SpecialStudent("Сергей", "Сергеев", 5);
        SpecialStudent sp2 = new SpecialStudent("Сергеев", course);
        SpecialStudent sp3 = new SpecialStudent(5465);


    }
}
