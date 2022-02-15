package expense.tracker.home.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeMemberController {
    @GetMapping("/")
    public String index(){
        return "Hi Shuvo";
    }
}
