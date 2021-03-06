package com.thoughtworks.nho.olsapi.repository;

import com.thoughtworks.nho.olsapi.entity.TaskCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskCardRepository extends CrudRepository<TaskCard, String> {
}
