package com.portafolio.SpringBoot.repository;

import com.portafolio.SpringBoot.model.experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface experienciaRepository extends JpaRepository <experiencia, Long>{
    
}