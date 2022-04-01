package com.javaguides.springboot.repository;

import com.javaguides.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {//o Long é a chave primaria

}
