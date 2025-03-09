package webapp.application.todoolist.service;

import org.springframework.stereotype.Service;
import webapp.application.todoolist.repository.PostsRepository;

import java.util.List;

@Service
public class PostsService {
    private final PostsRepository postsRepository;

    public PostsService(PostsRepository postsRepository) {
        this.postsRepository = postsRepository;
    }

    public List<Posts> getAllPosts(){
        return postsRepository.findAll();
    }
}
