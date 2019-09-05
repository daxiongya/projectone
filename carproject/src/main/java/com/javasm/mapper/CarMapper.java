package com.javasm.mapper;

import com.javasm.model.CarModel;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CarMapper {

    @Select("select * from car where car_status=0")
    public List<CarModel> getCarList();
}
