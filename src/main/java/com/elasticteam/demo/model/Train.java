package com.elasticteam.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * The model Train.
 */
@Getter
@Setter
@Entity
@Table(name = "trains")
public class Train {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "Cannot be null")
    private long id;

    @NotNull(message = "Cannot be null")
    private String name;

    @NotNull(message = "Cannot be null")
    private String description;

    @Column(name = "\"distance-between-stop\"")
    @NotNull(message = "Cannot be null")
    @JsonProperty("distance-between-stop")
    private String distanceBetweenStop;

    @Column(name = "\"max-speed\"")
    @NotNull(message = "Cannot be null")
    @JsonProperty("max-speed")
    private String maxSpeed;

    @Column(name = "\"sharing-tracks\"")
    @NotNull(message = "Cannot be null")
    @JsonProperty("sharing-tracks")
    private Boolean sharingTracks;

    @Column(name = "\"grade-crossing\"")
    @NotNull(message = "Cannot be null")
    @JsonProperty("grade-crossing")
    private Boolean gradeCrossing;

    @Column(name = "\"train-frequency\"")
    @NotNull(message = "Cannot be null")
    @JsonProperty("train-frequency")
    private String trainFrequency;

    @NotNull(message = "Cannot be null")
    private String amenities;

    /**
     * Sets train name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets train name.
     *
     * @return the train name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets train description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets train description.
     *
     * @return the train description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets train distanceBetweenStop.
     *
     * @param distanceBetweenStop the distanceBetweenStop
     */
    public void setDistanceBetweenStop(String distanceBetweenStop) {
        this.distanceBetweenStop = distanceBetweenStop;
    }

    /**
     * Gets train distance between stop.
     *
     * @return the train distanceBetweenStop
     */
    public String getDistanceBetweenStop() {
        return distanceBetweenStop;
    }

    /**
     * Sets train maxSpeed.
     *
     * @param maxSpeed the maxSpeed
     */
    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * Gets train max speed.
     *
     * @return the train maxSpeed
     */
    public String getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Sets train sharingTracks.
     *
     * @param sharingTracks the sharingTracks
     */
    public void setSharingTracks(Boolean sharingTracks) {
        this.sharingTracks = sharingTracks;
    }

    /**
     * Gets train Sharing Tracks.
     *
     * @return the train sharingTracks
     */
    public Boolean getSharingTracks() {
        return sharingTracks;
    }

    /**
     * Sets train gradeCrossing.
     *
     * @param gradeCrossing the gradeCrossing
     */
    public void setGradeCrossing(Boolean gradeCrossing) {
        this.gradeCrossing = gradeCrossing;
    }

    /**
     * Gets train gradeCrossing.
     *
     * @return the train gradeCrossing
     */
    public Boolean getGradeCrossing() {
        return gradeCrossing;
    }

    /**
     * Sets train trainFrequency.
     *
     * @param trainFrequency the trainFrequency
     */
    public void setTrainFrequency(String trainFrequency) {
        this.trainFrequency = trainFrequency;
    }

    /**
     * Gets train trainFrequency.
     *
     * @return the train trainFrequency
     */
    public String getTrainFrequency() {
        return trainFrequency;
    }

    /**
     * Sets train amenities.
     *
     * @param amenities the amenities
     */
    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    /**
     * Gets train amenities.
     *
     * @return the train amenities
     */
    public String getAmenities() {
        return amenities;
    }

}
