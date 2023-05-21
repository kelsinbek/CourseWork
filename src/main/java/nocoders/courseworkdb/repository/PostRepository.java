package nocoders.courseworkdb.repository;

import nocoders.courseworkdb.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
