package com.elasticteam.demo.repository;

import com.elasticteam.demo.model.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The interface Train repository.
 */
@Repository
public interface TrainRepository extends JpaRepository<Train, Long> {

    List<Train> findAll();


}
