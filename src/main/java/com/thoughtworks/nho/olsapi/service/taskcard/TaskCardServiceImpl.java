package com.thoughtworks.nho.olsapi.service.taskcard;

import com.thoughtworks.nho.olsapi.entity.TaskCard;
import com.thoughtworks.nho.olsapi.repository.TaskCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskCardServiceImpl implements TaskCardService {
    TaskCardRepository repository;

    @Autowired
    public TaskCardServiceImpl(TaskCardRepository repository){
        this.repository = repository;
    }


    @Override
    public void addTaskCard(TaskCard taskCard) {
        repository.save(taskCard);
    }

    @Override
    public Optional<TaskCard> getTaskCardById(String id) {
        return repository.findById(id);
    }
}
