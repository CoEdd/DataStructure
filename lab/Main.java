import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String dagFilePath = "workflow.dag";

        WorkflowGraph workflowGraph = new WorkflowGraph();
        try {
            workflowGraph.readDagFile(dagFilePath);

            System.out.println("Tasks sorted by estimated run time:");
            List<Task> sortedTasks = workflowGraph.getSortedTasksByRunTime();
            for (Task task : sortedTasks) {
                System.out.println("Task " + task.getTaskName() + " : " + task.getEstimatedRunTime());
            }

            System.out.println("\nCritical Path:");
            List<Task> criticalPath = workflowGraph.getCriticalPath();
            for (int i = 0; i < criticalPath.size(); i++) {
                System.out.print("Task " + criticalPath.get(i).getTaskName());
                if (i < criticalPath.size() - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
            int criticalPathTime = workflowGraph.getCriticalPathTime(criticalPath);
            System.out.println("Total Run Time: " + criticalPathTime);

        } catch (IOException e) {
            System.err.println("Error reading input files: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
