
package com.portafolio.SpringBoot.Controller;

import com.portafolio.SpringBoot.model.experiencia;
import com.portafolio.SpringBoot.repository.experienciaRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class Controller {
    @Autowired
    private experienciaRepository repositorio;
    
    @GetMapping ("/experiencia")
    public List<experiencia> verExperiencia(){
        return repositorio.findAll();
    }
    @PostMapping ("/experiencia")
    public experiencia crearExperiencia(@RequestBody experiencia exp){
        return repositorio.save(exp);
    }
    @GetMapping ("/experiencia/{id_ex}")
    public ResponseEntity<experiencia> buscarExperiencia(@PathVariable Long id_ex){
        experiencia exp = repositorio.findById(id_ex).orElse(null);
        return ResponseEntity.ok(exp);       
    }
    @PutMapping ("/experiencia/{id_ex}")
    public ResponseEntity<experiencia> editarExperiencia(@PathVariable Long id_ex, @RequestBody experiencia detallesExp){
        experiencia exp = repositorio.findById(id_ex)
                .orElseThrow(null);
        exp.setTrabajo(detallesExp.getTrabajo());
        exp.setEmpresa_n(detallesExp.getEmpresa_n());
        exp.setEmpresa_l(detallesExp.getEmpresa_l());
        exp.setInicio_ex(detallesExp.getInicio_ex());
        exp.setFin_ex(detallesExp.getFin_ex());
        exp.setDescripcion_ex(detallesExp.getDescripcion_ex());
        experiencia expActualizada = repositorio.save(exp);
        return ResponseEntity.ok(expActualizada);       
    }
    @DeleteMapping("/experiencia/{id_ex}")
	public ResponseEntity<Map<String,Boolean>> eliminarExperiencia(@PathVariable Long id_ex){
		experiencia exp = repositorio.findById(id_ex)
				            .orElseThrow(null);
		
		repositorio.delete(exp);
		Map<String, Boolean> respuesta = new HashMap<>();
		respuesta.put("eliminar",Boolean.TRUE);
		return ResponseEntity.ok(respuesta);
    }
    
}
