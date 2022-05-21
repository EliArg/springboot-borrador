package com.portafolio.SpringBoot.service;

import com.portafolio.SpringBoot.model.experiencia;
import com.portafolio.SpringBoot.repository.experienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ExperienciaService implements IExperienciaService {

    @Autowired
    public experienciaRepository expRepo;
    
    @Override
    public List<experiencia> verExperiencia() {
        return expRepo.findAll();
    }

    @Override
    public void crearExperiencia(experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id_ex) {
        expRepo.deleteById(id_ex);
    }

    @Override
    public experiencia buscarExperiencia(Long id_ex) {
        return expRepo.findById(id_ex).orElse(null);
    }
    @Override
    public void editarExperiencia(Long id_ex, experiencia exp) {
        expRepo.save(exp);
    }
}
