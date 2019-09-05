package com.javasm.controller;

import com.javasm.model.CarModel;
import com.javasm.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.UUID;

@Controller
@CrossOrigin
public class CarController {
    @Autowired
    private ICarService carService;

    @GetMapping("getCar")
    public ResponseEntity<List<CarModel>> getCarList(){
        return ResponseEntity.ok(carService.getCarList());
    }
}
