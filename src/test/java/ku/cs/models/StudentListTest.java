package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    @Test
    public void testStudentListFindStudentById() {
        StudentList list = new StudentList();
        list.addNewStudent("6610400001", "student1");
        list.addNewStudent("6610400002", "student2");
        list.addNewStudent("6610400003", "student3");

        Student student = list.findStudentById("6610400001");

        String expected = "student1";
        String actual = student.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void testGiveScoreToId() {
        StudentList list = new StudentList();
        list.addNewStudent("6610400001", "student1", 40);
        list.addNewStudent("6610400002", "student2", 38);
        list.addNewStudent("6610400003", "student3", 45);

        list.giveScoreToId("6610400001", 5);

        double expected = 45;
        double actual = list.findStudentById("6610400001").getScore();
        assertEquals(expected, actual);
    }

    @Test
    public void testViewGradeOfId() {
        StudentList list = new StudentList();
        list.addNewStudent("6610400001", "student1", 80);
        list.addNewStudent("6610400002", "student2", 78);
        list.addNewStudent("6610400003", "student3", 65);

        String expected = "A";
        String actual = list.viewGradeOfId("6610400001");
        assertEquals(expected, actual);
    }

}