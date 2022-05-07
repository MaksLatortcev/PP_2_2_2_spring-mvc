package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;


@Controller
public class CarsController {

    @GetMapping("/cars")
    public String getCars(Model model,
                          @RequestParam(required = false) String count) {
        CarService carService = new CarServiceImp();
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}
