package com.thoughtworks.nho.olsapi.service.taskcard;

import com.thoughtworks.nho.olsapi.entity.TaskCard;
import com.thoughtworks.nho.olsapi.repository.TaskCardRepository;
import com.thoughtworks.nho.olsapi.service.taskcard.TaskCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskCardServiceImpl implements TaskCardService {
    @Autowired
    TaskCardRepository repository;
    @Override
    public void addTaskCard(TaskCard taskCard) {
        repository.save(taskCard);
    }
}
