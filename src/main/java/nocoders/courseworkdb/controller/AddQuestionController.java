package nocoders.courseworkdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import nocoders.courseworkdb.model.Question;
import nocoders.courseworkdb.service.QuizService;

@Controller
public class AddQuestionController {
    @Autowired
    private QuizService quizService;

    @GetMapping("/listQuestions")
    public String viewHomePage(Model model) {
        List<Question> listQuestion = quizService.listAll();
        model.addAttribute("listQuestion", listQuestion);
        System.out.print("Get / ");
        return "listQuestions";
    }

    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("question", new Question());
        return "new";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveQuestion(@ModelAttribute("question") Question questions) {
        quizService.save(questions);
        return "redirect:/listQuestions";
    }

    @RequestMapping("/edit/{quesId}")
    public ModelAndView showEditQuestionPage(@PathVariable(name = "quesId") int quesId) {
        ModelAndView mav = new ModelAndView("new");
        Question question = quizService.get(quesId);
        mav.addObject("question", question);
        return mav;

    }
    @RequestMapping("/delete/{quesId}")
    public String deletequestion(@PathVariable(name = "quesId") int quesId) {
        quizService.delete(quesId);
        return "redirect:/listQuestions";
    }
}