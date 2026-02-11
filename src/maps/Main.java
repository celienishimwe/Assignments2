package maps;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        try {
            Map<Integer, String> students = new HashMap<>();


            StudentManager.addStudent(students, 1, "Alice");
            StudentManager.addStudent(students, 3, "Bob");
            StudentManager.addStudent(students, 2, "Charlie");


            System.out.println("Sorted students: " + StudentManager.sortStudents(students));


            System.out.println("Search ID 2: " + StudentManager.searchStudent(students, 2));


            System.out.println("Highest ID: " + StudentManager.findStudentWithHighestId(students));
            System.out.println("Lowest ID: " + StudentManager.findStudentWithLowestId(students));


            StudentManager.removeStudent(students, 1);


            StudentManager.addStudent(students, -5, "celie");


            StudentManager.addStudent(students, 4, "");


            StudentManager.addStudent(null, 5, "celise");

        } catch (NullPointerException e) {
            throw new RuntimeException(e);

        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }
}

