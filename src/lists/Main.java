package lists;

public class Main {

    public static void main(String[] args) {

        try {
            TaskManager manager = new TaskManager();


            manager.addTask("homework");
            manager.addTask("reading");
            manager.addTask("assignment");

            manager.displayTasks();

            manager.sortTasks();
            manager.displayTasks();


            int index = manager.searchTask("Reading");
            System.out.println("Task found at index: " + index);


            System.out.println("Longest task: " + manager.findLongestTask());


            System.out.println("Task at index 1: " + manager.getTaskByIndex(1));


            manager.removeTask("homework");
            manager.displayTasks();


            manager.addTask("");
            manager.getTaskByIndex(10);

        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            throw new RuntimeException(e);

        } finally {
            System.out.println("TaskManager finished.");
        }
    }
}

