package lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TaskManager {

    private List<String> arrayTasks = new ArrayList<>();
    private List<String> linkedTasks = new LinkedList<>();


    public void addTask(String task) {
        if (task == null || task.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid task!");
        }
        arrayTasks.add(task);
        linkedTasks.add(task);
        System.out.println("Task added: " + task);
    }


    public void sortTasks() {
        Collections.sort(arrayTasks);
        Collections.sort(linkedTasks);
        System.out.println("Tasks sorted.");
    }


    public int searchTask(String task) {
        return arrayTasks.indexOf(task);
    }


    public void removeTask(String task) {
        arrayTasks.remove(task);
        linkedTasks.remove(task);
        System.out.println("Task removed: " + task);
    }


    public String findLongestTask() {
        if (arrayTasks.isEmpty()) {
            throw new IllegalArgumentException("Task list is empty!");
        }

        String longest = arrayTasks.get(0);
        for (String task : arrayTasks) {
            if (task.length() > longest.length()) {
                longest = task;
            }
        }
        return longest;
    }


    public String getTaskByIndex(int index) {
        return arrayTasks.get(index); // may throw IndexOutOfBoundsException
    }


    public void displayTasks() {
        System.out.println("Tasks: " + arrayTasks);
    }
}

