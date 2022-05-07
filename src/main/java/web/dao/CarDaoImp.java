package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Repository
public class CarDaoImp implements CarDao {

    private final List<Car> listCars;

    public CarDaoImp() {
        this.listCars = new ArrayList<>();
        this.listCars.add(new Car(1, "lada-vesta", "е001кх"));
        this.listCars.add(new Car(2, "Zaporosjec", "е002кх"));
        this.listCars.add(new Car(3, "Niva", "е003кх"));
        this.listCars.add(new Car(4, "KAMAZ", "е004кх"));
        this.listCars.add(new Car(5, "YAZ", "е005кх"));
    }

    @Override
    public List<Car> getCars() {
        return listCars;
    }
}
