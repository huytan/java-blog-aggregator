package cz.tannth.jba.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import cz.tannth.jba.entity.Blog;
import cz.tannth.jba.entity.Item;
import cz.tannth.jba.entity.Role;
import cz.tannth.jba.entity.User;
import cz.tannth.jba.entity.builder.*;
import cz.tannth.jba.repository.BlogRepository;
import cz.tannth.jba.repository.ItemRepository;
import cz.tannth.jba.repository.RoleRepository;
import cz.tannth.jba.repository.UserRepository;

@Transactional
@Service
public class InitDbService {
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BlogRepository blogRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	@PostConstruct
	public void init(){
		if (roleRepository.findByName("ROLE_ADMIN") == null) {
			Role roleUser = new RoleBuilder().withName("ROLE_USER").build();
			roleRepository.save(roleUser);
			
			Role roleAdmin = new RoleBuilder().withName("ROLE_ADMIN").build();
			roleRepository.save(roleAdmin);
			
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			
			User userAdmin = new UserBuilder().user().withName("admin").withPassword(encoder.encode("admin"))
							 .withEnabled(true).build();
				
			
			List<Role> roles = new ArrayList<Role>();
			roles.add(roleAdmin);
			roles.add(roleUser);
			userAdmin.setRoles(roles);
			userRepository.save(userAdmin);
			
			Blog blogJavavids = new BlogBuilder().blog().withName("JavaVids").withUrl("http://feeds.feedburner.com/javavids?format=xml")
					.withUser(userAdmin).build();
			
			blogRepository.save(blogJavavids);
		
		}
	}
}
