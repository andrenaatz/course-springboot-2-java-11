package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;


//como UserRepository herda de JpaRepository não necessitamos especificar @Repository ou @Component pois ele na herança já herda a implementação como componente do Spring
public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
