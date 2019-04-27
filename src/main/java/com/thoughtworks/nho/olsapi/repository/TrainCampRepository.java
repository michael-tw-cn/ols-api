package com.thoughtworks.nho.olsapi.repository;

import com.thoughtworks.nho.olsapi.entity.TrainCamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TrainCampRepository extends JpaRepository<TrainCamp,Integer> {

    @Query(value = "select * from t_traincamp where status = 1 ",nativeQuery = true)
    List<TrainCamp> findAvailableTranCamps();
}
