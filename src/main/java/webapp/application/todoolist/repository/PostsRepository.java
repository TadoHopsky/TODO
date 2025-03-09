package webapp.application.todoolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webapp.application.todoolist.service.Posts;


@Repository
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
