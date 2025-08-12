package firstdemomvc;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/car")
public class CarController {

    private CarService carService = new CarService(); // ideally use @Autowired

    @GetMapping("/list")
    public String showCarList(Model m) {
        List<String> carList = carService.getAllCars();
        m.addAttribute("cars", carList);
        return "carlist";
    }
}
