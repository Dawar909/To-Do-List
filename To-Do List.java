import java.util.ArrayList;
import java.util.Scanner;

class ToDoList {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> UsersTasks = new ArrayList<>();
        String TaskName;
        int choice;
        String TaskRemover;
        while (true) { 
            System.out.println("\n1.Add a task");
            System.out.println("2.Show tasks");
            System.out.println("3.Remove a task");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
            case 1:
                System.out.println("Enter task description");
                TaskName = scanner.nextLine();
                UsersTasks.add(TaskName);
            break;                
            case 2:
            if (UsersTasks.isEmpty()) {
                System.out.println("There are no tasks to show");
            }
            for(String TaskPrinter : UsersTasks){
                System.out.println("Here are your tasks");
                System.out.println(TaskPrinter);
            }
            break;
            case 3:
                if (UsersTasks.isEmpty()) {
                    System.out.println("There are no tasks to remove");
                }
                
                for(String TaskPrinter : UsersTasks)
                    System.out.println(TaskPrinter);
                        System.out.println("Which task do you want to remove");
                        TaskRemover = scanner.nextLine();
                        UsersTasks.remove((TaskRemover));
                                   
                break;
            case 4:
                    System.out.println("Thank you for using To-Do List");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice , please try again");
            }          
        }
    }        
}            