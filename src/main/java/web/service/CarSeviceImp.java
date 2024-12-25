package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarSeviceImp implements CarService{

    public CarSeviceImp(List<String> carList) {

    }


    @Override
    public List<Car> listCar(Integer count) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("bmv", "m5", 777));
        carList.add(new Car("mercedes", "s", 999));
        carList.add(new Car("porshe", "911", 555));
        carList.add(new Car("vw", "touareg", 888));
        carList.add(new Car("toyota", "lc200", 444));

        return carList.stream().limit(count).toList();
    }


}
