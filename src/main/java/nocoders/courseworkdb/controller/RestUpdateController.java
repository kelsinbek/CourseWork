package nocoders.courseworkdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import nocoders.courseworkdb.model.Feedback;
import nocoders.courseworkdb.repository.FeedbackRepository;
import nocoders.courseworkdb.service.FeedbackService;


@Controller
public class RestUpdateController {

    @Autowired
    private FeedbackService feedbackService;

    @Autowired
    private FeedbackRepository feedbackRepository;

    @PostMapping("/update")
    public String addFeedback(@RequestParam("comment") String comment,
                              @RequestParam("rating") int rating,
                              @RequestParam("name") String name) {

        Feedback feedback = new Feedback(count() + 1, comment, rating, name);
        feedbackRepository.save(feedback);

        return "redirect:/users/profile";
    }


    public Integer count() {
        int i = 1;
        while (feedbackRepository.existsById(i))
            i++;
        return i;
    }
}
