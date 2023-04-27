package nocoders.courseworkdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import nocoders.courseworkdb.model.Result;

@Repository
public interface ResultRepo extends JpaRepository<Result, Integer> {

}
