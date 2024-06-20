import java.util.ArrayList;
import java.util.List;

public class Task {
    private String taskName;
    private int estimatedRunTime;
    private List<String> dependencies;

    public Task(String taskName, int estimatedRunTime) {
        this.taskName = taskName;
        this.estimatedRunTime = estimatedRunTime;
        this.dependencies = new ArrayList<>();
    }

    public String getTaskName() {
        return taskName;
    }

    public int getEstimatedRunTime() {
        return estimatedRunTime;
    }

    public List<String> getDependencies() {
        return dependencies;
    }

    public void addDependency(String dependency) {
        dependencies.add(dependency);
    }
}

