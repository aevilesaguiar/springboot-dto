package com.javaguides.springboot.repository;


import com.javaguides.springboot.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
//operações para as entidades interagirem com o banco de dados
public interface LocationRepository extends JpaRepository<Location, Long> {

}
