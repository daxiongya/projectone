package com.javasm.quartz;


import com.javasm.model.CarModel;
import com.javasm.service.ICarService;
import com.javasm.utils.SendPhoneUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SendMessage {
    @Autowired
    private ICarService carService;
    public void sendMessage(){
        List<CarModel> list = carService.getCarList();
        for(CarModel car :list){
            SendPhoneUtil.sendPhone(car.getCarPhone(),"12345");
        }
    }
}
