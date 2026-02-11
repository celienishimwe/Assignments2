package arrays;

import java.util.Arrays;

public class GradeManager {

    private int[] grades;
    private int count;


    public GradeManager(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be greater than 0");
        }
        grades = new int[size];
        count = 0;
    }


    public void addGrade(int grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }
        if (count >= grades.length) {
            throw new ArrayIndexOutOfBoundsException("list is full");
        }
        grades[count] = grade;
        count++;
        System.out.println("Grade added: " + grade);
    }


    public double getAverage() {
        if (count == 0) {
            throw new IllegalArgumentException("No grades available");
        }
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += grades[i];
        }
        return (double) sum / count;
    }


    public int getHighest() {
        if (count == 0) {
            throw new IllegalArgumentException("No grades available");
        }
        int max = grades[0];
        for (int i = 1; i < count; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }


    public int getLowest() {
        if (count == 0) {
            throw new IllegalArgumentException("No grades available");
        }
        int min = grades[0];
        for (int i = 1; i < count; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }


    public void sortGrades() {
        Arrays.sort(grades, 0, count);
        System.out.println("Grades sorted.");
    }


    public boolean searchGrade(int grade) {
        for (int i = 0; i < count; i++) {
            if (grades[i] == grade) {
                return true;
            }
        }
        return false;
    }


    public void displayGrades() {
        System.out.print("Grades: ");
        for (int i = 0; i < count; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.println();
    }
}

