package test;

import com.zhai.entity.FlightEntity;
import com.zhai.service.FlightService;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        FlightService flightService=new FlightService();
//        List<FlightEntity> flightEntities=flightService.getByFlightAll();
//        System.out.println(flightEntities);

//        FlightEntity flightEntity=flightService.getByIdFlight(1);
//        System.out.println(flightEntity);

//int result=flightService.deleteByIdFlight(1);
//        System.out.println(result);
FlightEntity flightEntity=new FlightEntity();
//flightEntity.setCompany("山东");
//flightEntity.setArriveAirport("北京");
flightEntity.setDepartureAirport("东航");

List<FlightEntity> flightEntities=flightService.getByIdFlightPoJo(flightEntity);
System.out.println(flightEntities);
    }
}
