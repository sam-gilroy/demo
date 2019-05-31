package edu.depaul.cdm.se.demo.Controllers;
import edu.depaul.cdm.se.demo.Repositories.RoomType_NoSQL_Repo;
import edu.depaul.cdm.se.demo.model.RoomType_NoSQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class RoomType_NoSQL_controller {

    @Autowired
    RoomType_NoSQL_Repo roomTypeRepository;

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("roomTypeList", roomTypeRepository.findAll());
        return "home";
    }

}
