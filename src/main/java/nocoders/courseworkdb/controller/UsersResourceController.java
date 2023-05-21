package nocoders.courseworkdb.controller;

import nocoders.courseworkdb.model.Post;
import nocoders.courseworkdb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class UsersResourceController {

    @Autowired
    private PostRepository postRepository;
    @GetMapping("/resource")
    public String blogMain(Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "users/resource";
    }

    @GetMapping("/resource/{id}")
    public String blogDetails(@PathVariable(value = "id") long id, Model model) {
        if (!postRepository.existsById(id)) {
            return "redirect:/users/resource";
        }
        Optional<Post> post = postRepository.findById(id);
        ArrayList<Post> res = new ArrayList<>();
        post.ifPresent(res::add);
        model.addAttribute("post", res);
        return "users/resource-details";
    }

//    @GetMapping("/admin/resource")
//    public String AdminResource(){
//        return "admin/resource";
//    }
}
