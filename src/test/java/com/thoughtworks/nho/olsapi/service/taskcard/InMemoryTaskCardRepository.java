package com.thoughtworks.nho.olsapi.service.taskcard;

import com.thoughtworks.nho.olsapi.entity.TaskCard;
import com.thoughtworks.nho.olsapi.repository.TaskCardRepository;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryTaskCardRepository implements TaskCardRepository {
    private static final ConcurrentHashMap<String, TaskCard> taskCardMap = new ConcurrentHashMap<>();
    @Override
    public <S extends TaskCard> S save(S entity) {
        taskCardMap.put(entity.getId(), entity);
        return entity;
    }

    @Override
    public <S extends TaskCard> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<TaskCard> findById(String s) {
        return Optional.ofNullable(taskCardMap.get(s));
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public Iterable<TaskCard> findAll() {
        return null;
    }

    @Override
    public Iterable<TaskCard> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(TaskCard entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends TaskCard> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
