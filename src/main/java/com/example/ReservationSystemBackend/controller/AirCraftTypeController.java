package com.example.ReservationSystemBackend.controller;

import com.example.ReservationSystemBackend.entity.AirCraftType;
import com.example.ReservationSystemBackend.service.AirCraftTypeService;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class AirCraftTypeController {

    private AirCraftTypeService airCraftTypeService;

    public AirCraftTypeController(AirCraftTypeService airCraftTypeService) {
        //super();
        this.airCraftTypeService = airCraftTypeService;
    }

    @GetMapping("/aircraft-types")
    public List <AirCraftType> getAirCraftTypeList() {
        return airCraftTypeService.getAllAircraftType();
    }



    //Saving students data
    @PostMapping("/save-aircraft-type")
    public AirCraftType saveAircraftType(@Valid @ModelAttribute("aircraft_type") AirCraftType airCraftType) {
//    	 airCraftTypeService.saveAircraftType(new AirCraftType("B1","69","50","40","30",false));
    	
    	
//            airCraftTypeService.saveAircraftType(new AirCraftType("B1","69","50","40","30",false));
    	
    	return airCraftTypeService.saveAircraftType(airCraftType);
    }

}
