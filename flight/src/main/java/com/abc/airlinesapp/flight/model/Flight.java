package com.abc.airlinesapp.flight.model;

/**
 * Flight class
 * @author bgsre
 *
 */
public class Flight {
    private Integer id;
    private String flightCode;
    private String make;
    private String model;
    private Integer mileage;

    public Flight() {

    }

    public Flight(Integer id, String flightCode, String make, String model) {
        this.id = id;
        this.flightCode = flightCode;
        this.make = make;
        this.model = model;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

