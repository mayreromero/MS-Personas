package com.home.api.cru.demo.repository;


import com.home.api.cru.demo.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface IPersonasRepository extends JpaRepository<Persona, Long> {

}
