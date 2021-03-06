package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.homework.Car;
import com.kodilla.collections.homework.Fiat;
import com.kodilla.collections.homework.Mazda;
import com.kodilla.collections.homework.Opel;

import java.util.LinkedList;
import java.util.List;

public class GeneralCarsListApplication {


    public static void main(String[] args) {
        List<Car> cars = new LinkedList<>();

        cars.add(new Fiat(63));
        cars.add(new Mazda(96));
        cars.add(new Opel(112));



        System.out.println(cars.size());
        for (Car car : cars){
            System.out.println(cars + ",Mazda " + car.getSpeed() +
                    ",Opel " + car.getSpeed() + ",Fiat " + car.getSpeed());


        }

    }
}
