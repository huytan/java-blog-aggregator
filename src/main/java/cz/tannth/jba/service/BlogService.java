package cz.tannth.jba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import cz.tannth.jba.entity.Blog;
import cz.tannth.jba.entity.User;
import cz.tannth.jba.repository.BlogRepository;
import cz.tannth.jba.repository.UserRepository;

@Service
public class BlogService {

	@Autowired
	private BlogRepository blogRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public void save(Blog blog, String name) {
		User user =	userRepository.findByName(name);	
		blog.setUser(user);
		blogRepository.save(blog);
	}

	public Blog findOne(int id) {
		return blogRepository.findOne(id);
	}
	@PreAuthorize("#blog.user.name == authencation.name or hasRole('ROLE_ADMIN')")
	public void delete(@P("blog")Blog blog) {
		blogRepository.delete(blog);
		
	}

}
