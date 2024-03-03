package org.lld;

public class Task {
    private String taskId;
    private String taskName;
    private User assignedUser;

    public Task(String taskId, String taskName, User assignedUser) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.assignedUser = assignedUser;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }
}
