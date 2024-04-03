package com.springrestapi.BusReservation.BusService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.springrestapi.BusReservation.BusEntity.BusTrip;
import com.springrestapi.BusReservation.BusRepository.BusTripRepo;

@Service
public class BusTripService {
	
	@Autowired
	private BusTripRepo busTripRepo;
	
	public List<BusTrip> getAllTrips(){
		return busTripRepo.findAll();
	}
	
	public BusTrip getTripById(int tripid) {
		return busTripRepo.findById(tripid).get();
	}
	
	public void addTrip(BusTrip busTrip) {
		busTripRepo.save(busTrip);
	}
	
	public void updateTrip(int tripid) {
		BusTrip busTrip= busTripRepo.findById(tripid).get();
		busTrip.setArrivalCity("Delhi");
		busTripRepo.save(busTrip);
		
	}
	
	public void deleteTrip(int tripid) {
		busTripRepo.deleteById(tripid);
	}

}
