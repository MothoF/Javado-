import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Task Manager ===");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    Task new_task = new Task(task,"a task to complete",false);
                    manager.addTask(new_task);
                    break;
                case 2:
                    System.out.println("Tasks: " + manager.listTasks());
                    break;
                case 3:
                    System.out.print("Enter task to delete: ");
                    String tas = scanner.nextLine();
                    for (Task task_obj : manager.listTasks()){
                        if (task_obj.getTitle().equals(tas)){
                            manager.deleteTask(task_obj);
                        }
                    }
                    System.out.println("Deleting...");
                    break;
                case 4:
                    manager.exit();
                    System.out.println("Exiting......");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}