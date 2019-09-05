package com.javasm.service;

import com.javasm.mapper.CarMapper;
import com.javasm.model.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CarService implements ICarService {
    @Autowired
    private CarMapper carMapper;

    @Override
    public List<CarModel> getCarList() {
        return carMapper.getCarList();
    }
}
