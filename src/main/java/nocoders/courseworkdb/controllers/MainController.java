  package nocoders.courseworkdb.controllers;

  import lombok.RequiredArgsConstructor;
  import org.springframework.stereotype.Controller;
  import org.springframework.ui.Model;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.springframework.web.bind.annotation.ModelAttribute;
  import org.springframework.web.bind.annotation.PostMapping;
  import org.springframework.web.bind.annotation.RequestParam;

  import java.io.IOException;

  @Controller
  @RequiredArgsConstructor
  public class MainController {
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

    @GetMapping("/")
    public String profile(Model model) {
      model.addAttribute("title", "Страница абитуриента");
      return "profile";

    }
  }


