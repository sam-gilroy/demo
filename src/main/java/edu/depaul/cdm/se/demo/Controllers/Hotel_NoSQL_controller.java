package edu.depaul.cdm.se.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.depaul.cdm.se.demo.model.Hotel_NoSQL;
import edu.depaul.cdm.se.demo.Repositories.Hotel_NoSQL_Repo;

@Controller
public class Hotel_NoSQL_controller {
    @Autowired
    Hotel_NoSQL_Repo hotelRepository;

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("hotelList", hotelRepository.findAll());
        return "home";
    }
}
