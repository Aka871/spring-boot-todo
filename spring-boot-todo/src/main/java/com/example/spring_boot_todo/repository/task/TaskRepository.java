package com.example.spring_boot_todo.repository.task;

import com.example.spring_boot_todo.service.task.TaskEntity;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TaskRepository {

  @Select("SELECT id, summary, description, status FROM tasks;")
  List<TaskEntity> select();
}
