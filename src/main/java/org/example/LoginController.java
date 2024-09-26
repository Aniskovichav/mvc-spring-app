package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Objects;

@Controller
public class LoginController {

    @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
    public ModelAndView loginProcess(@ModelAttribute("login") Login login) {

        ModelAndView modelAndView = new ModelAndView();
        if (!Objects.isNull(login)) {
            if (login.getLogin().equalsIgnoreCase("Bob")
                    && login.getPassword().equalsIgnoreCase("123")) {
                modelAndView.setViewName("welcome");
                modelAndView.addObject("firstName", login.getLogin());
                return modelAndView;
            }
        }

        modelAndView.setViewName("login");
        modelAndView.addObject("msg", "Incorrect login or password");
        
        return modelAndView;
    }
}
