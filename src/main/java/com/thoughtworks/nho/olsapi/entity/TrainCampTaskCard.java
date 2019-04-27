package com.thoughtworks.nho.olsapi.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_traincamp_taskcard")
public class TrainCampTaskCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long trainCampId;

    private Integer taskCardId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTrainCampId() {
        return trainCampId;
    }

    public void setTrainCampId(Long trainCampId) {
        this.trainCampId = trainCampId;
    }

    public Integer getTaskCardId() {
        return taskCardId;
    }

    public void setTaskCardId(Integer taskCardId) {
        this.taskCardId = taskCardId;
    }

    public TrainCampTaskCard(Long trainCampId, Integer taskCardId) {
        this.trainCampId = trainCampId;
        this.taskCardId = taskCardId;
    }

    public TrainCampTaskCard() {
    }
}
