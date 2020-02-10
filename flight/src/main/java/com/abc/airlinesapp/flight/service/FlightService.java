package com.abc.airlinesapp.flight.service;

import java.util.ArrayList;
import java.util.List;

import com.abc.airlinesapp.flight.model.Flight;

/**
 * This class implements methods for flight microservice.
 * @author bgsre
 *
 */
public class FlightService {

    /**
     * Find flight by id
     * @param id
     * @return
     */
    public Flight findById(Integer id) {

        //find flight based on ID using primary key id
        //FlightPK pk = new FlightPK();
        //ps.getID(flightId);
        //FlightVO flight = (FlightVO)flightDAO.findByPrimaryKey(pk);
        //return flight;

        return new Flight(id, "AB212", "AirBus", "A380");
    }

    /**
     * Find all flights by route
     * @return
     */
    public List<Flight> findFlightByRoute(String routeId, String isActive) {
        List<Flight> l = new ArrayList<>();

        //find all the flights using Flight Data Access Object
        //criteria.add(routeId)
        //criteria.add(isActive)
        //return(getFlightDAO.findAll(criteria));
        return l;
    }

    /**
     * Find all active flights
     * @return
     */
    public List<Flight> findAll(String isActive) {
        List<Flight> l = new ArrayList<>();

        //find all the flights using Flight Data Access Object
        //return(getFlightDAO.findAll());
        return l;
    }

    /**
     * Returns available flights in a route
     * @param routeId
     */
    public List<Flight> checkFlightAvailability(Integer routeId) {
        List<Flight> l = new ArrayList<>();

        //Need to provide implementation
        return l;
    }
}
