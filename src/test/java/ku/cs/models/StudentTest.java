package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
//    Student s1;
//    @BeforeAll
//    void init() {
//        s1 = new Student("661040555", "human");
//    }

    @Test
    public void testIsId(){
        Student s1 = new Student("6610402222", "alina");
        boolean actual = s1.isId("6610402222");
        assertTrue(actual);
    }

    @Test
    public void testAddscore(){
        Student s1 = new Student("6610402222", "alina");
        s1.addScore(40);
        assertEquals(40,s1.getScore());
        s1.addScore(30);
        assertEquals(70,s1.getScore());

    }

    @Test
    public void testCalculateGrade(){
        Student s1 = new Student("6610402223", "baline", 50);
        s1.addScore(10);
        assertEquals("C", s1.grade());
    }

    @Test
    public void testChangeName(){
        Student s1 = new Student("6610402222", "alina");
        s1.changeName("alan");
        assertEquals("alan", s1.getName());
    }

}