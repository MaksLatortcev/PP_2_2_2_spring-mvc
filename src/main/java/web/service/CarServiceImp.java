package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;


@Service
public class CarServiceImp implements CarService {

    @Autowired
    private CarDao carDao;

    public CarServiceImp() {
        this.carDao = new CarDaoImp();
    }

    @Override
    public List<Car> getCars(String count) {
        if (count == null || Integer.parseInt(count) > 5) {
            return carDao.getCars();
        } else {
            return carDao.getCars().subList(0, Integer.parseInt(count));
        }
    }
}
