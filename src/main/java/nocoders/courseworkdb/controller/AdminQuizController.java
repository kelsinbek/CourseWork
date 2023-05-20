package nocoders.courseworkdb.controller;

import nocoders.courseworkdb.model.Question;
import nocoders.courseworkdb.model.Quiz;
import nocoders.courseworkdb.model.User;
import nocoders.courseworkdb.repository.QuizRepository;
import nocoders.courseworkdb.repository.QuestionRepository;
//import nocoders.courseworkdb.repository.QuizRepository.java;
import nocoders.courseworkdb.service.QuizService;
import nocoders.courseworkdb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@Controller
public class AdminQuizController {

    private UserService userService;

    @Autowired
    private QuizService quizService;
    @Autowired
    private QuizRepository quizRepository;
    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/quizAdd")
    public String quizAdd(
            Model model) {
        model.addAttribute("quiz", new Quiz());
//        model.addAttribute("questions", new HashSet<Question>());

        return "admin/quizAdd";
    }

    @GetMapping("admin/listQuestions/{quizId}")
    public String quizDetails(
            @PathVariable Long quizId,
            Model model) {
        List<Question> questions = questionRepository.findByQuizId(quizId);
        Quiz quiz = quizRepository.findById(quizId).orElseThrow();
        model.addAttribute("question", new Question());
        model.addAttribute("quiz", quiz);
        model.addAttribute("listQuestion", questions);
        model.addAttribute("quizId", quizId);

        System.out.println("quizId quizDe = " + quizId);

        return "admin/listQuestions";
    }

    @GetMapping("admin/listQuestions/{quizId}/new")
    public String add(@PathVariable Long quizId, Model model) {
        model.addAttribute("question", new Question());
        model.addAttribute("quizId", quizId);
        return "admin/new";
    }

    @PostMapping("/admin/save")
    public String saveQuestion(@ModelAttribute("question") Question question,
                               @RequestParam(name = "quizId", required = true) Long quizId) {
        // Проверяем, что quizId не равно null
        if (quizId == null) {
            // Возвращаем страницу ошибки, если quizId не указан
            return "admin/error";
        }
        // Ищем соответствующий Quiz по quizId
        Quiz quiz = quizRepository.findById(quizId).orElseThrow(() -> new NoSuchElementException("Quiz not found"));
        // Связываем Question с найденным Quiz
        question.setQuiz(quiz);
        // Сохраняем Question в репозитории
        questionRepository.save(question);
        // Возвращаем страницу со списком вопросов для данного Quiz
        return "redirect:/admin/listQuestions/" + quizId;
    }



    @GetMapping("admin/listQuestions/edit/{quesId}")
    public ModelAndView showEditQuestionPage(@PathVariable(name = "quesId") Long quesId) {
        ModelAndView mav = new ModelAndView("admin/new");
        Question question = quizService.get(quesId);
        mav.addObject("question", question);
        mav.addObject("quizId", question.getQuiz().getId()); // добавляем quizId в ModelAndView
        return mav;
    }

    @RequestMapping("admin/listQuestions/delete/{quesId}")
    public String deleteQuestion(@PathVariable(name = "quesId") Long quesId) {
        // Получаем вопрос по идентификатору
        Question question = quizService.get(quesId);
        // Получаем идентификатор квиза, к которому относится вопрос
        Long quizId = question.getQuiz().getId();
        // Удаляем вопрос
        quizService.delete(quesId);
        // Перенаправляем пользователя на страницу со списком вопросов для соответствующего квиза
        return "redirect:/admin/listQuestions/" + quizId;
    }

    @GetMapping("/quizEdit")
    public String quizEdit(@RequestParam Quiz quiz, Model model) {
        model.addAttribute("quiz", quiz);
        return "admin/quizEdit";
    }


    @PostMapping("/quizSave")
    public String quizSave(
            @AuthenticationPrincipal User users,
            @Valid @ModelAttribute Quiz quiz,
            BindingResult bindingResult,
            Model model
    ) {
//        quiz.setAuthor(users);

        if (bindingResult.hasErrors()) {
            return "admin/quizEdit";
        }

        quizRepository.save(quiz);

        Iterable<Quiz> quizzes = quizRepository.findAll();

        model.addAttribute("quizzes", quizzes);

        return "redirect:/admin/main";
    }

}

