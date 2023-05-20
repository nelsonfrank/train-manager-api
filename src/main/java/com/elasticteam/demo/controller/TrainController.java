package com.elasticteam.demo.controller;

import com.elasticteam.demo.error.EntityNotFoundException;
import com.elasticteam.demo.error.MethodNotAllowedException;
import com.elasticteam.demo.model.Train;
import com.elasticteam.demo.repository.TrainRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

import javax.validation.Valid;

/**
 * The type Train controller.
 */
@RestController
@RequestMapping(value = "/trains")
public class TrainController {
    /**
     * The Train repository.
     */
    @Autowired
    TrainRepository trainRepository;

    /**
     * Gets all trains.
     *
     * @return the all trains
     */
    @GetMapping()
    public ResponseEntity<List<Train>> getAllTrains() throws Exception {
        List<Train> trains = trainRepository.findAll();
        return new ResponseEntity<>(trains, HttpStatus.OK);
    }

    /**
     * Gets train by id.
     *
     * @return the train by id
     */
    @GetMapping("/{id}")
    public ResponseEntity<Train> getTrainById(@PathVariable Long id) throws EntityNotFoundException {
        Train train = trainRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("train not found"));

        return new ResponseEntity<>(train, HttpStatus.OK);
    }

    /**
     * Update Train response entity.
     *
     * @param id           the train id
     * @param trainDetails the train details
     * @return the response entity
     * @throws EntityNotFoundException the resource not found exception
     */
    @PutMapping("/{id}")

    public ResponseEntity<Object> updateTrainDetail(
            @PathVariable(value = "id") Long id, @Valid @RequestBody Train trainDetails) {

        Train train = trainRepository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException("train not found"));

        train.setName(trainDetails.getName());
        train.setDescription(trainDetails.getDescription());
        train.setDistanceBetweenStop(trainDetails.getDistanceBetweenStop());
        train.setMaxSpeed(trainDetails.getMaxSpeed());
        train.setSharingTracks(trainDetails.getSharingTracks());
        train.setGradeCrossing(trainDetails.getGradeCrossing());
        train.setTrainFrequency(trainDetails.getTrainFrequency());
        train.setAmenities(trainDetails.getAmenities());

        trainRepository.save(train);

        HashMap<String, String> response = new HashMap<>();
        response.put("message", "train edited successfully");

        return new ResponseEntity<>(response, HttpStatus.OK);

    }

    @RequestMapping(value = "/**")
    public ModelAndView noHandlerMappingFound() throws MethodNotAllowedException {
        throw new MethodNotAllowedException("Invalid endpoint");
    }
}
