package t3h.vn.backend_2208.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("home")
    public String home(@RequestParam(required = false) String name) {
        return "/jsp/home.jsp";
    }

    @GetMapping("home2")
    @ResponseBody
    public String home2(@RequestParam(required = false) String name) {
        return "/jsp/home.jsp";
    }
}
