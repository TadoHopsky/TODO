package webapp.application.todoolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import webapp.application.todoolist.service.Posts;
import webapp.application.todoolist.service.PostsService;

import java.util.List;

@Controller
@RequestMapping("/todoo")
public class ListController {

    private final PostsService postsService;

    public ListController(PostsService postsService) {
        this.postsService = postsService;
    }

    @GetMapping("/all")
    public String allToDoo(Model model){
        List<Posts> allPosts = postsService.getAllPosts();
        model.addAttribute("allPosts", allPosts);
        return "allTooDoo";
    }
}
