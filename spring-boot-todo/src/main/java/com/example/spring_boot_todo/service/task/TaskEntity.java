package com.example.spring_boot_todo.service.task;

public record TaskEntity(
    long id,
    String summary,
    String description,
    TaskStatus status
) {

}
