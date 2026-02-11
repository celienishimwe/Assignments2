package arrays;

public class Main {

    public static void main(String[] args) {

        try {
            GradeManager manager = new GradeManager(5);

            manager.addGrade(80);
            manager.addGrade(90);
            manager.addGrade(70);
            manager.addGrade(85);

            manager.displayGrades();

            System.out.println("Average grade: " + manager.getAverage());
            System.out.println("Highest grade: " + manager.getHighest());
            System.out.println("Lowest grade: " + manager.getLowest());

            manager.sortGrades();
            manager.displayGrades();

            System.out.println("Searching for 90: " + manager.searchGrade(90));


            manager.addGrade(120);
            manager.addGrade(60);

        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);

        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
    }
}