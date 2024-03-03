package org.lld;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> taskList;
    private List<User> userList;

    public TaskManager()
    {
        this.taskList = new ArrayList<>();
        this.userList = new ArrayList<>();
    }

    public void addTask(Task task)
    {
        taskList.add(task);
    }

    public void addUser(User user)
    {
        userList.add(user);
    }

    public List<Task> getTasksOfUser(User user)
    {
        List<Task> userTaskList = new ArrayList<>();

        for(Task curTask:taskList)
        {
            if(curTask.getAssignedUser().equals(user))
            {
                userTaskList.add(curTask);
            }
        }
        return userTaskList;
    }
}
