package web.controller;

import model.CarModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImp;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "10") Integer count, Model model) {

        List<CarModel> carChoice = CarServiceImp.carList().stream().limit(count).collect(Collectors.toList());

        model.addAttribute("carModels", carChoice);
        return "cars";
    }
}
