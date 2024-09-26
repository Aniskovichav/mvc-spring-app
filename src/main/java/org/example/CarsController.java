package org.example;

import org.example.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private static List<Car> cars;

    static {
        cars = new ArrayList<>();
        cars.add(new Car(123, "BMW M5", 15000.5));
        cars.add(new Car(235, "BMW M3", 13001.5));
        cars.add(new Car(44, "AUDI S3", 11020.5));
        cars.add(new Car(53234, "AUDI S6", 12000.5));
        cars.add(new Car(323, "AUDI S4", 13401.5));
        cars.add(new Car(51234, "AUDI R7", 16000.5));
    }

    // show all cars
    @RequestMapping("/view-all")
    public ModelAndView showAll() {
        ModelAndView modelAndView = new ModelAndView();
        if(!Objects.isNull(cars)) {
            modelAndView.setViewName("cars");
            modelAndView.addObject("cars", cars);
        }
        return modelAndView;
    }

    @RequestMapping("/delete_car")
    public ModelAndView deleteCarById(@RequestParam String id) {
        if (id != null){
            int parseId = Integer.parseInt(id);
            int index = -1;
            for (int i = 0; i < cars.size(); i++) {
                Car car = cars.get(i);
                if(car.getId() == parseId) {
                    index = i;
                }
            }
            if (index != -1) {
                cars.remove(index);
                System.out.println("Cars with index = " + index + "was deleted successfully");
            }
        }

        return showAll();
    }

    // show car by id
    // delete car by id
    // create car

    @RequestMapping(value = "/create_car", method = RequestMethod.GET)
    public ModelAndView showCarForm(@ModelAttribute("car") Car car) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("cars");
        modelAndView.addObject(new Car()); //stub
        return modelAndView;
    }

    @RequestMapping(value = "/create_car", method = RequestMethod.POST)
    public ModelAndView createCarForm(@ModelAttribute("car") Car car) {
        ModelAndView modelAndView = new ModelAndView();
        if (!Objects.isNull(car)) {
            cars.add(car);
        }

        return showAll();
    }
}
    // update car



