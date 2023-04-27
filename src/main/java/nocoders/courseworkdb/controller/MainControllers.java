//  package nocoders.courseworkdb.controller;
//
//  import lombok.RequiredArgsConstructor;
//  import org.springframework.stereotype.Controller;
//  import org.springframework.ui.Model;
//  import org.springframework.web.bind.annotation.GetMapping;
//
//  @Controller
//  @RequiredArgsConstructor
//  public class MainControllers {
//    @GetMapping("/register")
//    public String register(Model model) {
//      model.addAttribute("title", "Страница регистрации");
//      return "register";
//
//    }
//    @GetMapping("/login")
//    public String login(Model model) {
//      model.addAttribute("title", "Страница входа");
//      return "login";
//
//    }
//
//    @GetMapping("/")
//    public String profile(Model model) {
//      model.addAttribute("title", "Страница абитуриента");
//      return "profile";
//    }
//
//    @GetMapping("/test")
//    public String test(Model model) {
//      model.addAttribute("title", "Станица тестировании");
//      return "test";
//    }
//
//  }
//
//
//
