package com.example.spring_boot_todo.controller.task;

import com.example.spring_boot_todo.service.task.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor//finalがついているフィールドのコンストラクタを自動生成
public class TaskController {

  private final TaskService taskService;


  @GetMapping("/tasks") // /tasksのときにこのハンドラーメソッドが動く
  public String list(Model model) {
    var taskList = taskService.find()  // List<TaskEntity> -> List<TaskDOT>
        .stream()

        //.map(entity -> TaskDTO.toDTO(entity))をラムダ式で記述
        .map(TaskDTO::toDTO)
        .toList();
    model.addAttribute("taskList", taskList);
    return "tasks/list";
  }
}
