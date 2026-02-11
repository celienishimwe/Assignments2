package maps;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StudentManager {


    public static void addStudent(Map<Integer, String> students, int studentId, String name) {

        if (studentId <= 0) {
            throw new IllegalArgumentException("Student ID cannot be zero or negative!");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be empty or null!");
        }

        students.put(studentId, name);
        System.out.println("Student added: ID = " + studentId + ", Name = " + name);
    }


    public static Map<Integer, String> sortStudents(Map<Integer, String> students) {
        return new TreeMap<>(students);
    }


    public static String searchStudent(Map<Integer, String> students, int studentId) {
        return students.get(studentId);
    }


    public static void removeStudent(Map<Integer, String> students, int studentId) {
        students.remove(studentId);
        System.out.println("Student with ID " + studentId + " removed.");
    }


    public static int findStudentWithHighestId(Map<Integer, String> students) {
        return new TreeMap<>(students).lastKey();
    }


    public static int findStudentWithLowestId(Map<Integer, String> students) {
        return new TreeMap<>(students).firstKey();
    }
}

