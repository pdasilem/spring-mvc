package service;

import model.CarModel;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp{

    public static List<CarModel> carList() {
        final List<CarModel> carModels = new ArrayList<>();

            carModels.add(new CarModel("Toyota", "Vista", 2016));
            carModels.add(new CarModel("Toyota", "Corolla", 2006));
            carModels.add(new CarModel("Nissan", "March", 2012));
            carModels.add(new CarModel("Honda", "CR-V", 1997));
            carModels.add(new CarModel("Subaru", "Impresa", 2002));
        return carModels;
    }
}

