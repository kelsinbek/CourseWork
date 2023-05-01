package nocoders.courseworkdb.controller;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import nocoders.courseworkdb.model.QuestionForm;
import nocoders.courseworkdb.model.Result;
import nocoders.courseworkdb.service.QuizService;

@Controller
@RequiredArgsConstructor
public class MainController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String profile(Model model) {
      model.addAttribute("title", "Страница абитуриента");
      return "profile";
    }


}
