package nocoders.courseworkdb.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nocoders.courseworkdb.model.Feedback;
import nocoders.courseworkdb.repository.*;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public Iterable<Feedback> GetAllFeedback() {
        return feedbackRepository.findAll();
    }


}

