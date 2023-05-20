package nocoders.courseworkdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import nocoders.courseworkdb.model.Question;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Long> {


}