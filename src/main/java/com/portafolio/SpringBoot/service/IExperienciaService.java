package com.portafolio.SpringBoot.service;

import com.portafolio.SpringBoot.model.experiencia;
import java.util.List;

public interface IExperienciaService {
    public List<experiencia> verExperiencia();
    public void crearExperiencia(experiencia exp);
    public void borrarExperiencia(Long id_ex);
    public experiencia buscarExperiencia(Long id_ex);
    public void editarExperiencia(Long id_ex, experiencia exp);
}
