package nocoders.courseworkdb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResourceController {

    @GetMapping("/resource")
    public String resource(){
        return "users/resource";
    }

//    @GetMapping("/admin/resource")
//    public String AdminResource(){
//        return "admin/resource";
//    }
}
