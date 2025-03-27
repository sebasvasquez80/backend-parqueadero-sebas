package com.app.records.domain;

import jakarta.persistence.*;
import lombok.Data;
// import lombok.var;

@Entity
@Table(name = "records")
@Data
public class Records {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String userIde;

    @Column(nullable = false, unique = true)
    private int parkingTypeId;

    @Column(nullable = false)
    private int parkingSpotId;

    @Column(nullable = false)
    private int vehicleTypeId;

    @Column(nullable = false)
    private String plate;

    @Column(nullable = false)
    private String entryDate;

    @Column(nullable = false)
    private double entryTime;

    @Column(nullable = false)
    private String exitDate;

    @Column(nullable = false)
    private double exitTime;

    @Column(nullable = false)
    private boolean statusU;

    // Empty constructor (required for JPA)
    public Records() {}

    // Constructor with parameters
    public Records(String userIde, int parkingTypeId, int parkingSpotId, int vehicleTypeId, String plate, String entryDate, double entryTime, String exitDate, double exitTime, boolean statusU) 
    
    {
    this.userIde = userIde;
    this.parkingTypeId = parkingTypeId;
    this.parkingSpotId = parkingSpotId;
    this.vehicleTypeId = vehicleTypeId;
    this.plate = plate;
    this.entryDate = entryDate;
    this.entryTime = entryTime;
    this.exitDate = exitDate;
    this.exitTime = exitTime;
    this.statusU = statusU;
}

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserIde() {
        return userIde;
    }
    
    public void setUserIde(String userIde) {
        this.userIde = userIde;
    }
    
    public int getParkingTypeId() {
        return parkingTypeId;
    }
    
    public void setParkingTypeId(int parkingTypeId) {
        this.parkingTypeId = parkingTypeId;
    }
    
    public int getParkingSpotId() {
        return parkingSpotId;
    }
    
    public void setParkingSpotId(int parkingSpotId) {
        this.parkingSpotId = parkingSpotId;
    }
    
    public int getVehicleTypeId() {
        return vehicleTypeId;
    }
    
    public void setVehicleTypeId(int vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }
    
    public String getPlate() {
        return plate;
    }
    
    public void setPlate(String plate) {
        this.plate = plate;
    }
    
    public String getEntryDate() {
        return entryDate;
    }
    
    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }
    
    public double getEntryTime() {
        return entryTime;
    }
    
    public void setEntryTime(double entryTime) {
        this.entryTime = entryTime;
    }
    
    public String getExitDate() {
        return exitDate;
    }
    
    public void setExitDate(String exitDate) {
        this.exitDate = exitDate;
    }
    
    public double getExitTime() {
        return exitTime;
    }
    
    public void setExitTime(double exitTime) {
        this.exitTime = exitTime;
    }
    
    public boolean isStatusU() {
        return statusU;
    }
    
    public void setStatusU(boolean statusU) {
        this.statusU = statusU;
    }        
}
