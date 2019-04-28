package com.thoughtworks.nho.olsapi.service.taskcard;

import com.thoughtworks.nho.olsapi.entity.TaskCard;

import java.util.Optional;

public interface TaskCardService {
    void addTaskCard(TaskCard taskCard);

    Optional<TaskCard> getTaskCardById(String id);
}
