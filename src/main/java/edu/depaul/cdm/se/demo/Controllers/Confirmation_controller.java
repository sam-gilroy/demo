package edu.depaul.cdm.se.demo.Controllers;

import edu.depaul.cdm.se.demo.Repositories.ConfirmationRepository;
import edu.depaul.cdm.se.demo.Repositories.FacilityRepository;
import edu.depaul.cdm.se.demo.Repositories.ReservationRepository;
import edu.depaul.cdm.se.demo.model.Confirmation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.function.BinaryOperator;
import org.springframework.ui.Model;

@Controller
public class Confirmation_controller {

    @Autowired
    private FacilityRepository repo;

    public Confirmation_controller(){}

    @GetMapping
    public String showAll(Model model){
        model.addAttribute ("confirmation", repo.findAll());
        return "/edit";
    }
}
