package edu.depaul.cdm.se.demo.Controllers;
import edu.depaul.cdm.se.demo.Repositories.Hotel_NoSQL_Repo;
import edu.depaul.cdm.se.demo.Repositories.RoomTypeRepository;
import edu.depaul.cdm.se.demo.Repositories.RoomType_NoSQL_Repo;
import edu.depaul.cdm.se.demo.model.Reservation;
import edu.depaul.cdm.se.demo.model.RoomType_NoSQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class Home_controller {

    @Autowired
    RoomType_NoSQL_Repo roomTypeNoSQLRepository;

    @Autowired
    RoomTypeRepository roomTypeRepository;

    @Autowired
    Hotel_NoSQL_Repo hotelRepo;

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("roomTypeList", hotelRepo.findByHotelName("Chicago"));
        model.addAttribute("rooming", roomTypeNoSQLRepository.findAll());
        return "home";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("reservation", new Reservation());
        model.addAttribute("roomTypeList", roomTypeRepository.findAll());
        return "create";
    }

    @PostMapping("/create")
    public String createSubmit(@ModelAttribute Reservation reservation) {return "confirm";}

    @RequestMapping("/edit")
    public String edit() {
        return "edit";
    }

    @RequestMapping("/landing")
    public String landing() {
        return "landing";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/signup")
    public String signup() {
        return "signup";
    }
}
