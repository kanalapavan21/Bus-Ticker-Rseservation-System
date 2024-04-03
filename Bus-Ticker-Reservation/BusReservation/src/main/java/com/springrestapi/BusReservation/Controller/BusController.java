package com.springrestapi.BusReservation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springrestapi.BusReservation.BusEntity.BusTrip;

import com.springrestapi.BusReservation.BusService.BusTripService;

@RestController
@RequestMapping("/busreservation")
public class BusController {
	
	@Autowired
	private BusTripService busTripService;
	
	
	
	@GetMapping("/trip")
	public List<BusTrip> getAllTrip(){
		return busTripService.getAllTrips();
	}
	
	@GetMapping("/trip/{tripid}")
	public BusTrip getBusTripById(@PathVariable int tripid) {
		return busTripService.getTripById(tripid);
	}
	
	@PostMapping("/trip/addtrip")
	@ResponseStatus(code=HttpStatus.CREATED)
	public ResponseEntity<String> createTrip(@RequestBody BusTrip busTrip) {
		//busTripService.addTrip(busTrip);
		busTripService.addTrip(busTrip);
		return ResponseEntity.status(HttpStatus.CREATED).body("Trip Created Successfully");
		
	}
	
	@PutMapping("/trip/updatetrip/{tripid}")
	public ResponseEntity<String> updateTripDetails(@PathVariable int tripid){
		busTripService.updateTrip(tripid);
		return ResponseEntity.ok("Trip Updated Successfully");
		
	}
	
	@DeleteMapping("/trip/deletetrip/{tripid}")
	public ResponseEntity<String> deleteTrip(@PathVariable int tripid ){
		busTripService.deleteTrip(tripid);
		return ResponseEntity.ok("Trip Deleted Successfully");
	}

}
