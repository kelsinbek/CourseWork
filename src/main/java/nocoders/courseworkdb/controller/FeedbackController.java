package nocoders.courseworkdb.controller;


import nocoders.courseworkdb.model.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


import nocoders.courseworkdb.repository.FeedbackRepository;

@Controller
public class FeedbackController {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @GetMapping("/users/profile")
    public String getAllFeedbacks(ModelMap model) {
        Iterable<Feedback> allFB = feedbackRepository.findAll();
        model.addAttribute("feedbacks", allFB);
        return "users/main";
    }
}
