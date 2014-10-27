package cz.tannth.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.tannth.jba.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

	Role findByName(String name);

}
