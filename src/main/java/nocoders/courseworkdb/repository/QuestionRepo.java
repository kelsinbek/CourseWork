package nocoders.courseworkdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import nocoders.courseworkdb.model.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

}