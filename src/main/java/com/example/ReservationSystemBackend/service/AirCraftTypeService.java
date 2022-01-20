package com.example.ReservationSystemBackend.service;


import com.example.ReservationSystemBackend.entity.AirCraftType;

import java.util.List;

public interface AirCraftTypeService {

    List<AirCraftType> getAllAircraftType();

    AirCraftType saveAircraftType(AirCraftType airCraftType);

    AirCraftType getAirCraftTypeById(Long id);

    AirCraftType updateAirCraftType(AirCraftType airCraftType);

    void deleteAirCraftById(Long id);
}
