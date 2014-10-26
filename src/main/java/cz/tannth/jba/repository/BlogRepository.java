package cz.tannth.jba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.tannth.jba.entity.Blog;
import cz.tannth.jba.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
	List<Blog> findByUser(User user);
}
