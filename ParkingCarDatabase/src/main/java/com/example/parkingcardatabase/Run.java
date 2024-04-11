package com.example.parkingcardatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Run {

    private CarRepo carRepo;
    @Autowired
    public Run(CarRepo carRepo) {
        this.carRepo = carRepo;
    }



    public void addNewCar() {

        Car car = new Car("ABC23409","Opel","Astra",Color.BLACK);
            carRepo.save(car);


    Iterable<Car> all = carRepo.findAll();
    all.forEach(System.out::println);

    }
}
