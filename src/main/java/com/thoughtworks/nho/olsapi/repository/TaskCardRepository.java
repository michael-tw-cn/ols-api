package com.thoughtworks.nho.olsapi.repository;

import com.thoughtworks.nho.olsapi.model.TaskCard;
import org.springframework.data.repository.CrudRepository;

public interface TaskCardRepository extends CrudRepository<TaskCard, Integer> {
}
