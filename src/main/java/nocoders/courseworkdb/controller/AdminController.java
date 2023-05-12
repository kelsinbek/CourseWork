package nocoders.courseworkdb.controller;


import nocoders.courseworkdb.repository.QuizRepository;
import nocoders.courseworkdb.model.User;
import nocoders.courseworkdb.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
    @Autowired
    private QuizRepository quizRepository;

//    @GetMapping("/admin/")
//    public String greeting(Model model) {
//        return "admin/greeting";
//    }

    @GetMapping("admin/main")
    public String index(
            @AuthenticationPrincipal User user,
            @RequestParam(required = false, defaultValue = "") String filter,
            Model model
    ) {
        Iterable<Quiz> quizzes;

        if (filter != null && !filter.isEmpty()) {
            quizzes = quizRepository.findByTag(filter);
        } else {
            quizzes = quizRepository.findAll();
        }

//        model.addAttribute("isAdmin", user.isAdmin());
        model.addAttribute("quizzes", quizzes);

        return "admin/main";
    }

    @PostMapping("main/delete")
    public String delete(@RequestParam Long id, Model model) {
        quizRepository.deleteById(id);
        Iterable<Quiz> quizzes = quizRepository.findAll();

        model.addAttribute("quiz", new Quiz());
        model.addAttribute("quizzes", quizzes);

        return "redirect:/admin/main";
    }
}
