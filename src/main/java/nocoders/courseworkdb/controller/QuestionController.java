package nocoders.courseworkdb.controller;

import nocoders.courseworkdb.model.Question;
import nocoders.courseworkdb.model.QuestionForm;
import nocoders.courseworkdb.model.Result;
import nocoders.courseworkdb.service.QuestionService;
import nocoders.courseworkdb.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class QuestionController {
    private final QuestionService questionService;

    Boolean submitted = false;
    @Autowired
    QuizService qService;

    @Autowired
    Result result;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Autowired
    QuizService quizService;

    @GetMapping("/q/{quizId}/questions")
    public String getQuestionsByQuizId(@PathVariable Long quizId, Model model) {
        List<Question> questions = questionService.getQuestionsByQuizId(quizId);
        QuestionForm questionForm = new QuestionForm();
        questionForm.setQuestions(questions);
        System.out.println(quizId);


        model.addAttribute("qForm", questionForm);
        return "users/questions";
    }


    @PostMapping("/q/{quizId}/submit")
    public String submit(@ModelAttribute("qForm") QuestionForm questionForm, Model model, @PathVariable("quizId") Long quizId, Authentication authentication) {
        int totalCorrect = quizService.getResult(questionForm);
        Result result = new Result();
        result.setTotalCorrect(totalCorrect);

        // Получение имени пользователя из объекта Authentication
        if (authentication != null && authentication.isAuthenticated()) {
            String username = authentication.getName();
            result.setUsername(username);
        }

        quizService.saveScore(result);
        model.addAttribute("result", result);
        return "users/result";
    }


}


