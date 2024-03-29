package com.zhai.entity;

import java.util.Date;
import java.util.List;

public class FlightEntity {
    private Integer id;
    private String flightId;
    private String company;
    private String departureAirport;
    private String arriveAirport;
    private Date departureTime;
    private Date arriveTime;
    private String model;
    private Integer isDelete;

    @Override
    public String toString() {
        return "FlightEntity{" +
                "id=" + id +
                ", flightId='" + flightId + '\'' +
                ", company='" + company + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", arriveAirport='" + arriveAirport + '\'' +
                ", departureTime=" + departureTime +
                ", arriveTime=" + arriveTime +
                ", model='" + model + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArriveAirport() {
        return arriveAirport;
    }

    public void setArriveAirport(String arriveAirport) {
        this.arriveAirport = arriveAirport;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }


}
