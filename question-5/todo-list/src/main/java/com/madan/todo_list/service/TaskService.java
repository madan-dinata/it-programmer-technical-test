package com.madan.todo_list.service;

import com.madan.todo_list.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private final List<Task> tasks = new ArrayList<>();
    private Long nextId = 1L;

    public List<Task> getAllTasks() {
        return tasks;
    }

    public void addTask(String title) {
        tasks.add(new Task(nextId++, title));
    }

    public void toggleTask(Long id) {
        for (Task task : tasks) {
            if (task.getId().equals(id)) {
                task.setCompleted(!task.isCompleted());
                break;
            }
        }
    }

    public void deleteTask(Long id) {
        tasks.removeIf(task -> task.getId().equals(id));
    }
}