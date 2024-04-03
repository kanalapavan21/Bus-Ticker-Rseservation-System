package com.springrestapi.BusReservation.BusRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrestapi.BusReservation.BusEntity.BusTrip;

@Repository
public interface BusTripRepo extends JpaRepository<BusTrip, Integer> {
	
	

}
