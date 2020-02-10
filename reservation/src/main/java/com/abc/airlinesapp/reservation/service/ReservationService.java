package com.abc.airlinesapp.reservation.service;

import com.abc.airlinesapp.reservation.model.Booking;

/**
 * This class implements functions for ReservationService.
 * @author bgsre
 *
 */
public class ReservationService {

    /**
     * Find Reservation by booking code
     * @param id
     * @return
     */
    public Booking getBooking(String bookingCode) {

        //find reservation based on booking code using primary key id
        //ReservationPK pk = new ReservationPK();
        //ps.getID(reservationId);
        //ReservationVO reservation = (ReservationVO)reservationDAO.findByPrimaryKey(pk);
        //return reservation;

        return new Booking(1, 2, "a1", 1);
    }


    /**
     * This method provides implementation for creating booking
     * @return reservationInput
     */
    /*
     * public Reservation makeBooking(detailsDTO details) {
     * 
     *     //validate input data
     *     //create booking
     *     //process payment details - request payment service
     *     //generate ticket on successful processing for payment
     *     //notify user
     *  
     * }
     */

    /**
     * This method deletes a booking 
     * @param details
     * @return
     */
    /*
     * public boolean deleteBooking(detailsDTO details) { //authenticate user
     *     //authenticate user - request User service
     *     //validate booking for eligibility to delete     *      
     *     //audit user action 
     *     //delete reservation 
     *     //notify user
     * }
     */

}
