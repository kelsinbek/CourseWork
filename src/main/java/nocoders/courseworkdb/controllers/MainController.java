package nocoders.courseworkdb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String profile(Model model) {
        model.addAttribute("title", "Главная страница");
        return "profile";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("title", "Страница регистрации");
        return "register";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("title", "Страница входа");
        return "login";
    }
}


