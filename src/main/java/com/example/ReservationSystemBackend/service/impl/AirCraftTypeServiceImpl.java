package com.example.ReservationSystemBackend.service.impl;

import com.example.ReservationSystemBackend.entity.AirCraftType;
import com.example.ReservationSystemBackend.repository.AirCraftTypeRepository;
import com.example.ReservationSystemBackend.service.AirCraftTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirCraftTypeServiceImpl implements AirCraftTypeService {

    private AirCraftTypeRepository airCraftTypeRepository;

    public AirCraftTypeServiceImpl(AirCraftTypeRepository AirCraftTypeRepository) {
        //super();
        this.airCraftTypeRepository = AirCraftTypeRepository;
    }



    @Override
    public List<AirCraftType> getAllAircraftType() {
        return airCraftTypeRepository.findAll();
    }

    @Override
    public AirCraftType saveAircraftType(AirCraftType airCraftType) {
        return airCraftTypeRepository.save(airCraftType);
    }

    @Override
    public AirCraftType getAirCraftTypeById(Long id) {
        return airCraftTypeRepository.findById(id).get();
    }

    @Override
    public AirCraftType updateAirCraftType( AirCraftType airCraftType) {
       return airCraftTypeRepository.save(airCraftType);
    }

    @Override
    public void deleteAirCraftById(Long id) {
        airCraftTypeRepository.deleteById(id);
    }

}
