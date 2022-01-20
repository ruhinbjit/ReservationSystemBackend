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
    public String saveAircraftType(@Valid @ModelAttribute("aircraft_type") AirCraftType airCraftType, BindingResult error, Model model) {
        if (error.hasErrors()) {
            return "error";
        } else {
            airCraftTypeService.saveAircraftType(airCraftType);

            return "aircraft type saved";
            //return "redirect:/students";
        }
    }



}
