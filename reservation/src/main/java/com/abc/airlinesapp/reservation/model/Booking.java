package com.abc.airlinesapp.reservation.model;


/**
 * Booking class
 * @author bgsre
 *
 */
public class Booking {

    Integer userId;
    Integer routeId;
    String bookingCode;
    Integer noOfPeople;
    
    public Booking() {

    }

    public Booking(Integer userId, Integer routeId, String bookingCode, Integer noOfPeople) {
        this.userId = userId;
        this.routeId = routeId;
        this.bookingCode = bookingCode;
        this.noOfPeople = noOfPeople;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer UserId) {
        this.userId = userId;
    }
    
    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public Integer getNoOfPeople() {
        return noOfPeople;
    }

    public void setNoOfPeople(Integer noOfPeople) {
        this.noOfPeople = noOfPeople;
    }
    
    
    
}
