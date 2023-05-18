package nocoders.courseworkdb.service;

import nocoders.courseworkdb.model.Question;
import nocoders.courseworkdb.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class QuestionService {
    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getQuestionsByQuizId(Long quizId) {
        List<Question> questions = questionRepository.findByQuizId(quizId);
        Collections.shuffle(questions); // Перемешиваем вопросы

        if (questions.size() > 15) {
            questions = questions.subList(0, 15); // Берем только первые 15 вопросов
        }

        return questions;
    }
}

