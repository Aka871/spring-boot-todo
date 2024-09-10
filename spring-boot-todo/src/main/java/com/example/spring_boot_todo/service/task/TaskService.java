package com.example.spring_boot_todo.service.task;

import com.example.spring_boot_todo.repository.task.TaskRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {

  private final TaskRepository taskRepository;

  public List<TaskEntity> find() {
    return taskRepository.select();
  }
}
