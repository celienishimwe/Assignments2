package fileinputandoutput;
import java.io.*;
import java.util.*;

public class StudentSystem {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner user_input = new Scanner(System.in);

        try {
            BufferedReader reader = new BufferedReader(new FileReader("students.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                int age = Integer.parseInt(data[2].trim());
                int score = Integer.parseInt(data[3].trim());

                students.add(new Student(id, name, age, score));
            }

            reader.close();

        } catch (Exception e) {
            System.out.println("failed reading file.");
        }

        System.out.println("\n--- Student List ---");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s.id + " " + s.name + " " + s.age + " " + s.score);
        }

        int total = 0;
        Student highest = students.get(0);
        Student lowest = students.get(0);

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            total += s.score;

            if (s.score > highest.score) {
                highest = s;
            }

            if (s.score < lowest.score) {
                lowest = s;
            }
        }

        double average = (double) total / students.size();
        System.out.println("\nAverage score: " + average);
        System.out.println("Top student: " + highest.name + " (" + highest.score + ")");
        System.out.println("Lowest student: " + lowest.name + " (" + lowest.score + ")");


        System.out.println("\nStudents passed:");
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).score >= 50) {
                System.out.println(students.get(i).name);
            }
        }

        System.out.println("\nStudents  failed:");
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).score < 50) {
                System.out.println(students.get(i).name);
            }
        }
        System.out.println("\nAdd new student:");
        System.out.print("ID: ");
        int id = user_input.nextInt();
        user_input.nextLine();

        System.out.print("Name: ");
        String name =user_input.nextLine();

        System.out.print("Age: ");
        int age =user_input.nextInt();

        System.out.print("Score: ");
        int score =user_input.nextInt();

        students.add(new Student(id, name, age, score));

        // UPDATE SCORE
        System.out.print("\nEnter student ID to update score: ");
        int updateId =user_input.nextInt();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).id == updateId) {
                System.out.print("New score: ");
                students.get(i).score =user_input.nextInt();
            }
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"));

            for (int i = 0; i < students.size(); i++) {
                Student s = students.get(i);
                writer.write(s.id + "," + s.name + "," + s.age + "," + s.score);
                writer.newLine();
            }

            writer.close();
            System.out.println("\ndaata saved successfully.");

        } catch (Exception e) {
            System.out.println("failed saving file.");
        }
    }
}

