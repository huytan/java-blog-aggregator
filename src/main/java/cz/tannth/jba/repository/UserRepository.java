package cz.tannth.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.tannth.jba.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
