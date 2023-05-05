package nocoders.courseworkdb.repository;


import nocoders.courseworkdb.model.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {

    List<Question> findByQuizId(Long quizId);
}
