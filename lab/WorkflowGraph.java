package lab;

import java.io.*;
import java.util.*;

public class WorkflowGraph {
    private Map<String, Task> tasks;

    public WorkflowGraph() {
        tasks = new HashMap<>();
    }

    public void readDagFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("JOB")) {
                String[] parts = line.split(" ");
                String taskName = parts[1];
                String taskFile = parts[2];
                int estimatedRunTime = readEstimatedRunTime(taskFile);
                Task task = new Task(taskName, estimatedRunTime);
                tasks.put(taskName, task);
            } else if (line.startsWith("PARENT")) {
                String[] parts = line.split(" ");
                String parent = parts[1];
                String child = parts[3];
                tasks.get(child).addDependency(parent);
            }
        }
        reader.close();
    }

    private int readEstimatedRunTime(String taskFile) {
        BufferedReader reader = new BufferedReader(new FileReader(taskFile));
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("estimate_runtime")) {
                reader.close();
                return Integer.parseInt(line.split("=")[1].trim());
            }
        }
        reader.close();
    }

    public List<Task> getSortedTasksByRunTime() {
        List<Task> sortedTasks = new ArrayList<>(tasks.values());
        return sortedTasks;
    }

    public List<Task> getCriticalPath() {

    }

    private int findMaxTime(String taskName, Map<String, Integer> maxTimes, Map<String, String> predecessors) {
        
    }


    private String getEndTask(Map<String, Integer> maxTimes) {


    }

    public int getCriticalPathTime(List<Task> criticalPath) {

    }
}
