package com.mesozoic_eden.app.park;

import com.mesozoic_eden.app.model.dinosaur.Dinosaur;

public class DinosaurStatus {
    private Dinosaur dinosaur;
    private ParkLocations location;
    private String status;

    public DinosaurStatus(Dinosaur dinosaur, ParkLocations location, String status) {
        this.dinosaur = dinosaur;
        this.location = location;
        this.status = status;
    }

    public Dinosaur getDinosaur() {
        return dinosaur;
    }

    public ParkLocations getLocation() {
        return location;
    }

    public void setLocation(ParkLocations location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
