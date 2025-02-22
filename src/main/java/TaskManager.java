import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class TaskManager {
    private List<Task> tasks; // hint: will change in iteration 3

    public TaskManager() {
        // Initialize tasks list
        this.tasks = new ArrayList<>();
        this.exit();
        //return this.tasks;
    }

    public void addTask(Task task) {
        //this.tasks = taskManager();
        tasks.add(task);
        //throw new UnsupportedOperationException("Implement this method!");
    }

    public List<Task> listTasks() {
        return tasks;
        //throw new UnsupportedOperationException("Implement this method!");
    }

    public void deleteTask(Task task){
//        leave for iteration 4
        /*try {
            if (!tasks.contains(task)) {
                throw new IllegalArgumentException("Task not found!");
            } else {
                tasks.remove(task);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }*/
        if (!tasks.contains(task)) {
            throw new IllegalArgumentException("Task not found!");
        } else {
            tasks.remove(task);
        }
    }

    public void exit() {
        // leave for iteration 2
        try (FileWriter file = new FileWriter("tasks.csv");BufferedWriter bfile = new BufferedWriter(file)) {
            for (Task task : tasks){
                bfile.write(task.getTitle());
                bfile.newLine();
            }
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void markTaskAsComplete(Task task) {
        task.setComplete(true);
    }

    public void processMenuChoice(int choice) {
        /*try {
            if (choice > 4) {
                throw new IllegalArgumentException("Invalid menu option!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }*/
        throw new IllegalArgumentException("Invalid menu option!");
    }
}