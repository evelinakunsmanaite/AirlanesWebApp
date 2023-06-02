/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalTime;

/**
 *
 * @author shishkis
 */
public class Airlanes {
    private int flightNumber;
    private String airplaneType, destination;
    private LocalTime departureTime;
    private String week;

    public Airlanes(int flightNumber, String airplaneType, String destination, LocalTime departureTime, String week) {
        this.flightNumber = flightNumber;
        this.airplaneType = airplaneType;
        this.destination = destination;
        this.departureTime = departureTime;
        this.week = week;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    @Override
    public String toString() {
        return  "flightNumber = " + flightNumber + "\n" +
                "airplaneType = " + airplaneType + "\n" + 
                "destination = " + destination + "\n" + 
                "departureTime = " + departureTime + "\n" + 
                "week = " + week + "\n";
    }
}


